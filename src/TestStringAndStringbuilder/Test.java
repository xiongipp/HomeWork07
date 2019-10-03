package TestStringAndStringbuilder;

import java.io.Console;

public class Test {
    public static void main(String[] args) {
        String []s=new String[10000];
        for (int i=0;i<s.length;i++){
            s[i]="q";
        }
        TestString(s);
        TestStringBuilder(s);
    }
    static void TestString(String[] strings){
        long startTime = System.currentTimeMillis();
        String s="";
        for(int i=0;i<strings.length;i++){
            s=s+strings[i];
        }
        long endTime = System.currentTimeMillis();
        System.out.println("stringTime="+(endTime-startTime));
    }
    static void TestStringBuilder(String[] strings){
        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strings.length;i++){
            sb.append(strings[i]);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("stringBuilderTime="+(endTime2-startTime2));
    }

}
