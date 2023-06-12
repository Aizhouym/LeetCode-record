class Student(object):
    '''其中的@property，可以将方法设置为类的属性，直接通过类名调用。类似于将getSocre函数转为属性/
        于此同时，其中的__表示私有属性private。类在定义之后的括号中给出继承的父类，在类的方法中第一个参数为self表示实例化的每个对象。
    '''
    @property
    def score(self):
        return self.__score
    
    @score.setter
    def score(self, score):
        self.__score = score 

    def setSocre(self, score):
        self.__score = score
    
    def getScore(self):
        return self.__score 


import os

print(os.name)
print(os.uname_result)
print(os.path.abspath('.'))
