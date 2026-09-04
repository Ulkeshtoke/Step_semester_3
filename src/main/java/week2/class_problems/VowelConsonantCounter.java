// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class VowelConsonantCounter {
   public VowelConsonantCounter() {
   }

   public static void countVowelsAndConsonants(String var0) {
      int var1 = 0;
      int var2 = 0;

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 != 'a' && var4 != 'e' && var4 != 'i' && var4 != 'o' && var4 != 'u' && var4 != 'A' && var4 != 'E' && var4 != 'I' && var4 != 'O' && var4 != 'U') {
            if (var4 != ' ') {
               ++var2;
            }
         } else {
            ++var1;
         }
      }

      System.out.println("Vowels: " + var1 + " | Consonants: " + var2);
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter book title: ");
      String var2 = var1.nextLine();
      countVowelsAndConsonants(var2);
      var1.close();
   }
}
