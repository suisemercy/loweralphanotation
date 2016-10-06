/**
 * This file is part of loweralpha, an interactive development environment for alpha-notation.

 * Copyright (C) 2016 Jan Müller (muellerj@informatik.uni-bonn.de)

 * loweralpha is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * loweralpha is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with loweralpha.  If not, see <http://www.gnu.org/licenses/>.

 * Authores: Sirko Höer, Jan Müller, Maximus S.
 */

package model;

public class Token  {
	
	private int lineNumber;
	private int instructionIndex;
	private int regExpIndex;
	public String addrs[];
	public String op;
	
	public Token(int lineNumber,int instructionIndex, int regExpIndex)
	{
		addrs = new String[3];	
		this.lineNumber = lineNumber;
		this.instructionIndex = instructionIndex;
		this.regExpIndex = regExpIndex;
	}

	public int getLineNumber()
	{
		return lineNumber;
	}

	public int getInstructionIndex()
	{
		return instructionIndex;
	}
	
	public int getRegExpIndex()
	{
		return regExpIndex;
	}
}
