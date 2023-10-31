package org.sample;

	// A Class that represents use-defined exception

	class MyException extends Exception {
		public MyException(java.lang.String string)
		{
			// Call constructor of parent Exception
			super();
		}

	// A Class that uses above MyException
		// Driver Program
		public static void main(String args[])
		{
			try {
				// Throw an object of user defined exception
				throw new MyException("GeeksGeeks");
			}
			catch (MyException ex) {
				System.out.println("Caught");

				// Print the message from MyException object
				System.out.println(ex.getMessage());
			}
		}
	}

