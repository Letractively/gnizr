/*
 * gnizr is a trademark of Image Matters LLC in the United States.
 * 
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 * 
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either expressed or implied. See the License
 * for the specific language governing rights and limitations under the License.
 * 
 * The Initial Contributor of the Original Code is Image Matters LLC.
 * Portions created by the Initial Contributor are Copyright (C) 2007
 * Image Matters LLC. All Rights Reserved.
 */
package com.gnizr.core.exceptions;

public class NoSuchUserException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6177016309233131462L;

	public NoSuchUserException() {
		super();
	}

	public NoSuchUserException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	
	}

	public NoSuchUserException(String arg0) {
		super(arg0);
	
	}

	public NoSuchUserException(Throwable arg0) {
		super(arg0);

	}

}