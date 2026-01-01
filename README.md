Project: Chapter2_Challenge_Applet
Overview

This project explores Java Applets, a deprecated Java technology. A simple animated applet was created to demonstrate how applets worked and why they are no longer used today.

Applet Description

BouncingTextApplet extends Applet and implements Runnable.
It displays a moving text animation using:

Applet lifecycle methods (init, start, stop, paint)

A thread and a while loop

Thread.sleep() for animation timing

Graphics.drawString() for rendering

Security (Sandbox Model)

Java Applets were not allowed to:

Access or modify local files

Execute system commands or programs

These restrictions protected users from malicious code
