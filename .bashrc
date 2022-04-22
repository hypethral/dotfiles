
export PATH=$HOME/.local/bin:$PATH
force_color_prompt=yes

fortune | bash ~/.center.sh | lolcat

   if [ "$LOGNAME" = root ] || [ "`id -u`" -eq 0 ] ; then
        export PS1='\[\033[01;31m\]\u@\h\[\033[00m\]:\[\033[01;34m\]\w\[\033[01;34m\]#\033[00m\] '
    else
	PS1='\[\e[1;31m\][\[\e[m\]\[\e[1;97m\]\u\[\e[m\]\[\e[1;90m\]@\h\[\e[m\]\[\e[1;97m\] \W\[\e[m\]\[\e[1;31m\]]$ \[\e[m\]'
    fi
[ -r /usr/share/bash-completion/bash_completion   ] && . /usr/share/bash-completion/bash_completion
alias ls='ls --color=auto'
alias grep='grep --color=auto'
alias i3config='vim ~/.config/i3/config'
alias neofetch='neofetch --kitty /home/dark/my\ files/Pictures/new\ wallpapers/wallhaven-5d1m61.png'
alias bt='systemctl restart --now bluetooth'
