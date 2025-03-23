import math
class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        a=math.floor(x**0.5)
        b=int(a)
        return b