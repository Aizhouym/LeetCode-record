class Solution:
        def replaceSpace(self, target:str) -> str:
                output = "%20".join(word  for word in target.split(" "))

                return output
        