package readfile;

/**
 * Created by ashvinikumar on 21/11/16.
 */
import java.io.*;
import java.util.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

    public class FileDemo
    {
        public static void main(String[] args)
        {
            BufferedReader reader = null;

            BufferedWriter writer = null;

            //Create an ArrayList object to hold the lines of input file

            ArrayList<String> lines = new ArrayList<String>();

            try
            {
                //Creating BufferedReader object to read the input file

                reader = new BufferedReader(new FileReader("/home/ashvinikumar/file.txt"));

                //Reading all the lines of input file one by one and adding them into ArrayList

                String currentLine = reader.readLine();
                StringTokenizer st=new StringTokenizer(currentLine," ");
                String tokens[]=currentLine.split(" ");
                int tokenCount = tokens.length;
                String arr[]=new String[tokenCount];
                for (int j = 0; j < tokenCount; j++) {
                    System.out.println("Split Output: "+ tokens[j]);
                }

               for(int i=0;i<tokenCount;i++)
                {
                    int f=0;
                    String s1=tokens[i].substring(tokens[i].length()-1,tokens[i].length());
                    for(int j=i+1;j<tokenCount;j++)
                    {
                        String s2=tokens[j].substring(0,1);

                        if(s1.equals(s2))
                        {
                            String temp=tokens[i+1];
                            tokens[i+1]=tokens[j];
                            tokens[j]=temp;
                            f++;
                            break;
                        }
                        if(f==0 && j==tokenCount-1)
                        {
                            int k=i;
                            String temp=tokens[k];
                            for(;k<tokenCount;k++)
                            {
                                 tokens[i]=tokens[i+1];
                            }
                            tokens[i+1]=temp;

                        }

                    }





                }
                System.out.println("========");
                for (int j = 0; j < tokenCount; j++) {
                    System.out.println("Split Output: "+ tokens[j]);
                }
                currentLine="";
                for (int j = 0; j < tokenCount; j++) {
                    currentLine=currentLine+tokens[j]+" ";
                }

                while (currentLine != null)
                {
                    lines.add(currentLine);
                    currentLine = reader.readLine();
                }

                //Creating BufferedWriter object to write into output file

                writer = new BufferedWriter(new FileWriter("/home/ashvinikumar/file.txt"));

                //Writing sorted lines into output file

                for (String line : lines)
                {
                    writer.write(line);

                    writer.newLine();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
                //Closing the resources

                try
                {
                    if (reader != null)
                    {
                        reader.close();
                    }

                    if(writer != null)
                    {
                        writer.close();
                    }
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }