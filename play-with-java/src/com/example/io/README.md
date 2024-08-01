


common IO sources
=================

1. standard input/output
2. file input/output
3. network input/output
4. memory input/output



IO streams
===========

1. byte streams (8-bit) e.g image, audio, video
2. character streams (16-bit) e.g text based 


IO classes ( java.io )
===========

abstract classes
----------------

1. InputStream
2. OutputStream

3. Reader
4. Writer

concrete classes
----------------

source: file

1. FileInputStream
2. FileOutputStream

3. FileReader
4. FileWriter



When to use byte streams?

1. When you are dealing with binary data e.g image, audio, video
2. When you are dealing with raw data e.g reading/writing bytes from/to a file

When to use character streams?

1. When you are dealing with text data e.g reading/writing characters from/to a file
2. When you are dealing with text data over network e.g reading/writing characters from/to a socket