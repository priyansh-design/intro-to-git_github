import msvcrt
def iput():
    if msvcrt.kbhit():
        key=msvcrt.getch().decode("utf-8").lower()
        if key=="w":
            return 'w'
        
        elif key=="a":
            return 'a'
       
        elif key=="s":
            return 's'
        
        elif key=="d":
            return 'd'
        
        else:
            print("not a valid input")
        
print(iput())
