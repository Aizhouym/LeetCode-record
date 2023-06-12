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
print(os.path)


model_list = [2,37,40,42,41,12,20,45,4,31,10,26,48,47,34,18,5,27,32,21,6,14,36,46,25,28,17,23,7,19,22,8,16,33,49,35,15,13,11,9,3,50,1,44,43,29,39,24,38,30]
print(len(model_list))
print(sorted(model_list))