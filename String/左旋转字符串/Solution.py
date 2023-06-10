class Solution:
    def reverseLeftWords(self, s: str, n: int)-> str:
        head = s[:n:]
        output = s[n::]
        output = output + head
        
        return output