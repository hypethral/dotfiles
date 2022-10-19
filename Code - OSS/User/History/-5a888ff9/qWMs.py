import pyttsx3
import subprocess


#from decouple import config

USERNAME = 'dark'
BOTNAME = 'Karen'


engine = pyttsx3.init('espeak')

# Set Rate
engine.setProperty('rate', 160)

# Set Volume
engine.setProperty('volume', 2.0)

# Set Voice (Female)
voices = engine.getProperty('voices')
engine.setProperty('voice', 'en+f5')

def speak(text):
    """Used to speak whatever text is passed to it"""
    
    engine.say(text)
    engine.runAndWait()


speak("hello dark")
