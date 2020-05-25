import keyboard  # using module keyboard
while True:  # making a loop
    try:  # used try so that if user pressed other than the given key error will not be shown
        if keyboard.is_pressed('w'):
            m='w'
            break
        if keyboard.is_pressed('a'):
            m='a'
            break
        if keyboard.is_pressed('s'):
            m='s'
            break
        if keyboard.is_pressed('d'):
            m='d'   
            
            break  # finishing the loop
    except:
        break
    
print("you entered ",m)
