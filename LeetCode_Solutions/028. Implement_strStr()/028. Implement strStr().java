public int strStr(String haystack, String needle) {
	//length of haystack
  for (int i = 0; ; i++) {
  	//length of needle
    for (int j = 0; ; j++) {
      if (j == needle.length()) return i;
      if (i + j == haystack.length()) return -1;
      if (needle.charAt(j) != haystack.charAt(i + j)) break;
    }
  }
}

//Note: string's length:   length()