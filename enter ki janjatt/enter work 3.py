import msvcrt
'''
print("your turn")
if msvcrt.kbhit():
    msvcrt.getch()
print("hello")
'''

'''if msvcrt.kbhit():
    a=msvcrt.getch()
    print(a)
    '''

print ('Press s or n to continue:\n')
input_char = msvcrt.getch()
if input_char.upper() == 'S': 
   print ('YES')
    
