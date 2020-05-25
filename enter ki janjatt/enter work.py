from pynput import keyboard

print('Press s or n to continue:')

with keyboard.Events() as events:
    # Block for as much as possible
    event = events.get()
    if event.key == keyboard.KeyCode.from_char('s'):
        m='s'
print(m)        
