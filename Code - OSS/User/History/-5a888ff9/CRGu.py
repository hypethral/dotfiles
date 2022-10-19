import pyttsx3
import subprocess


#from decouple import config

USERNAME = 'dark'
BOTNAME = 'Karen'


engine = pyttsx3.init('espeak')

# Set Rate
engine.setProperty('rate', 140)

# Set Volume
engine.setProperty('volume', 1.0)

# Set Voice (Female)
voices = engine.getProperty('voices')
engine.setProperty('voice', 'en+f2')

def speak(text):
    """Used to speak whatever text is passed to it"""
    
    engine.say(text)
    engine.runAndWait()


speak("pacman pacman")
