/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.parser;

import java.io.*;
import antlr.Token;
import antlr.TokenStreamException;
import com.xruby.parser.symboltable.SymbolTableManager;

public class RubyLexerSmokeTest
{
	public static void main(String[] args)
	{
		if (args.length < 1)
		{
			System.out.println("Need to spefic a dir name!");
			return;
		}

		RubyLexerSmokeTest test = new RubyLexerSmokeTest();

		for (int i = 0; i < args.length; ++i)
		{
			test.run(new File(args[i]));
		}

		System.out.println(test.getNumberOfFiles() + " ruby programs have been lexed, " + test.getNumberOfFails() + " failed.");
	}

	private int numberOfFiles = 0;
	private int numberOfFails = 0;

	public int  getNumberOfFiles()
	{
		return numberOfFiles;
	}

	public int  getNumberOfFails()
	{
		return numberOfFails;
	}

	public void run(File f)
	{
		// If this is a directory, walk each file/dir in that directory
		if (f.isDirectory())
		{
			String files[] = f.list();
			for (int i=0; i < files.length; i++)
			{
				run(new File(f, files[i]));
			}
		}
		else if ((f.getName().length()>3) &&
				f.getName().substring(f.getName().length()-3).equals(".rb"))
		{
			++numberOfFiles;
			lexFile(f);
		}
	}

	private void lexFile(File f)
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(f));
			lexFile(reader, f.getPath());
			reader.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Can not open" + f.getPath());
			++numberOfFails;	
		}		
		catch (IOException e)
		{
			System.out.println("Can not close" + f.getPath());
		}
	}

	private void lexFile(BufferedReader reader, String filename)
	{
		SymbolTableManager stm = new SymbolTableManager();	
		StringBuilder debug_message = new StringBuilder();
		RubyLexer lexer = new RubyLexer(reader, stm);

		try
		{
			Token token;
			do
			{
				token = lexer.nextToken();
				
				debug_message.append(token.getText());
				debug_message.append("(");
				debug_message.append(token.getType());
				debug_message.append(",");
				debug_message.append(token.getLine());
				debug_message.append(")\n");
			}
			while (Token.EOF_TYPE != token.getType());
		}
		catch (TokenStreamException e)
		{
			System.out.println("lexer exception for " + filename + ": " + e.toString() + "\n" + debug_message.toString());
			++numberOfFails;
		}
		
		
	}
}
