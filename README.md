# Noter: a  no-nonsense note-taking tool

Noter is a simple Java program for writing TODOs on different files. Simply compile the java file on your system, then call "java noter" on your terminal and write your message.

## Why Noter?
I use org-mode (an Emacs mode/ file type) quite a lot and I'm a big fan of it. I use it for work, for planning my code, and for my personal todo-list. One annoying thing, though, is that I have to visit a certain file to add to each list. I might be at a work meeting and I get something to do, or I might be taking general notes and then want to write some comments on a specific java file. With Noter, all that note-taking gets a lot snappier.

More importantly, This tool couples well with the rest of my workflow because of the by-file formatting adjustment. You can adjust Noter to your system, instead of having to adapt to Noter.

## Setting it up
You can specify a specific file as an argument of the program, or assign one through the **targetFileName** variable. This way, you don't have to constantly specify a single file if you usually default to it, but you always have the option to 

All messages are prefixed by a *bullet* which, depending on certain filetypes, will ensure the added notes are formatted correctly. For example:
* The bullet "* TODO " is added on files of type .org an Emacs notekeeping mode
* The bullet "// TODO " is added on files of type .java, to correctly mark them as comments on java files.

And so on. You can also specify your own bullet that would get used on any filetype not included already (as of Version 1.1.3 Noter supports txt, org, md, java, py, and js), or you can choose to override all bullets and just assert your own for all files.

## Using Noter
Again, Noter is meant to adapt to your system, instead of you to Noter. There's a few adjustments on how to use Noter that might make it even easier:

### Org-mode
As usual, I'm encouraging people to try out Emacs. Org-mode has been particularly useful for note-taking, so I would really recommend it. To use Noter alongside org-mode, I suggest you keep a **notes.org** file in a directory of choice, and then add it to your agenda. You now have a file that has some or all of your TODOs, which you can access via the agenda, instead of having to switch to it every time you have a  note to add.

### Multiple Noters
If, like me, you like having separate files for different categories of notes, which are in separate directories (I have /Work, /Code, and /Personal directories), you could set up three versions of Noter, each with their own targetFileName, and place them into their respective directories. This is particularly helpful if you have more than one notes file that you tend to use.

### Add now, sort later
Alternatively, you may have (or want to have) a single doc that keeps all your notes.

## Future releases
The current version of Noter is already useful enough to make a difference, but there's some obvious possible improvements. I want to work on other projects for the time being, and I also wouldn't want to complicate the simplicity of noter, so these new features may come along slowly. Many of these would likely be new branches, as they might need some experimenting with, so make sure they don't overcomplicate Noter, making it a system out of itself, which we want to avoid! Anyhow, here's some planned features:

### Adjustable write-point
I.e. being able to decide where in the file a new note is added. The most basic form of this would be just to specify somewhere *that isn't the bottom of the file*, but it would also be worth trying to specify specific locations on demand (so as to be able to group notes by category in a single file)

### Multiple saved targetFileNames
I.e. having more than one default destination for notes, specified either by an argument when starting the program or as a prompt after writing the note.

### Setup commands
I.e. being able to run Noter and specifying targetFileNames, bullets, etc. instead of having to rewrite a java file and recompile.

### (Maybe) Noter on a GUI
I.e. moving out of a terminal and into a window of its own. This **does** turn it into a program/system more than anything else, but it would also be a lot less of a hassle for a lot of cases.

### Refactoring
I.e. rewriting Noter on elisp (for use on the Emacs command region), or just plain C

## Contact
I'm open to any suggestions or pull requests!
