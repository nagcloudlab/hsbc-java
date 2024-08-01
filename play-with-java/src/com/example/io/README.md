


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


When to use byte streams?

1. When you are dealing with binary data e.g image, audio, video
2. When you are dealing with raw data e.g reading/writing bytes from/to a file

When to use character streams?

1. When you are dealing with text data e.g reading/writing characters from/to a file
2. When you are dealing with text data over network e.g reading/writing characters from/to a socket


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


-----------------------------------------------------------
Serialization
-----------------------------------------------------------

Serialization is a mechanism of converting the state of an object 
into a byte stream. 
that can be persisted to a file or sent over a network.

why we need serialization?

1. To save/persist state of an object. 
   
    -> when object become passive (not in use)
    -> When we restart the application without losing the state of an object

2. To send state of an object over network.




when to use transient keyword?

1. If you don't want to serialize the state of a variable, use transient keyword.
e.g password, SSN, etc.



// by default,

all primitive types are serializable
string is serializable
all objects are serializable if their class implements Serializable interface.



