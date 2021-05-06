package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class ReverseFile {

	public static void main(String args[]) {

		try {

			FileInputStream fstream = new FileInputStream("C:\\Users\\user\\Desktop\\WF\\Questions_AT.txt");

			DataInputStream in = new DataInputStream(fstream);

			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

			String strLine;

			LinkedList list = new LinkedList();

			while ((strLine = br.readLine()) != null) {

				list.add(strLine);

			}

			FileWriter filestream = new FileWriter(
					"C:\\Users\\user\\Desktop\\WF\\Questions_AT.txt");

			BufferedWriter out = new BufferedWriter(filestream);

			int i;
			int len = list.size();

			for (i = len - 1; i >= 0; i--)

			{

				out.write((int) list.get(i));

				out.write("\n");

			}

			out.close();

			in.close();

		}

		catch (Exception e)

		{

			System.err.println("Error: " + e.getMessage());

		}

	}

}