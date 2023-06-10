class Solution:
        def reverseWords(self, s: str) -> str:
            s = s.strip()
            s = s[::-1]
            s = ' '.join(word[::-1] for word in s.split())
            return s
    
