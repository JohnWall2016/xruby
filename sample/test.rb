$:.unshift(File.dirname(__FILE__))

if ARGV.empty?
require 'test_alias'
require 'test_array'
require 'test_assignment_1'
require 'test_assignment'
require 'test_bignum'
require 'test_call'
require 'test_case'
require 'test_class'
require 'test_clone'
require 'test_condition'
require 'test_const'
require 'test_defined'
require 'test_eval'
require 'test_exception'
require 'test_file'
require 'test_float'
require 'test_hash'
require 'test_if_unless'
require 'test_integer'
require 'test_iterator'
require 'test_marshal'
require 'test_math'
require 'test_numeric'
require 'test_pack'
require 'test_path'
require 'test_proc'
require 'test_range'
require 'test_signal'
require 'test_string_and_char'
require 'test_struct'
require 'test_system'
require 'test_time'
require 'test_trace'
require 'test_variable'
require 'test_while_until'
require 'test_gc'
else
  for arg in ARGV
    require "test_#{arg}"
  end
end
