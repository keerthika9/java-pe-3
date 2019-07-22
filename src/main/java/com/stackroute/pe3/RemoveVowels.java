package com.stackroute.pe3;

public class RemoveVowels {
    public String[] remVow(String s[]) {
      for (int i = 0; i < s.length; i++)
        s[i] = s[i].replaceAll("[aeiouAEIOU]", "");
      return s;
    }

}
