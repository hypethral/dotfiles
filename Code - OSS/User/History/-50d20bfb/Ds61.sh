#!/bin/sh

function menu {
   selection = 0
   port = 0
   ip = 0
   while [$selection != 5]
   do
      clear
      echo "Please Select by pressing (1-4) ->"
      echo "1) Incoming Traffic"
      echo "2) Outgoing Traffic"
      echo "3) Forword"
      echo "4) Flush"
      echo "5) exit"
      read selection
      clear
      case $selection in
      1)
         input
         ;;
      2)
         ;;
      3)
         ;;
      4)
         ;;
      5)
         ;;
      *)
         ;;
      esac
   done
      
}

function input {
   selection = 0
   port = 0
   ip = 0
   echo "1) DROP all incoming traffic"
   echo "2) Allow port"
   echo "3) Allow port via ip or subnet"
   echo "4) Drop port"
   read selection
   ;;
   case $selection in
   1)
      iptables -A INPUT -j DROP
      echo "All incoming traffic blocked"
      ;;
   2)
      echo "Enter port number to Allow traffic->"
      read port
      iptables -I INPUT 1 -p tcp --dport $port -j ACCEPT
      ;;
   3)
      echo "Enter port number to Allow traffic->"
      read port
      echo "Standalone IP address Or with subnet (ex. 192.168.10.34) Input ->"
      read ip
      iptables -I INPUT 1 -p tcp --dport $port -s $ip -j ACCEPT
      ;;
   4)
      echo "Enter port number to Deny traffic->"
      read port
      iptables -I INPUT 1 -p tcp --dport $port -j DROP
      ;;
   *)
      echo "Select Correct Option, Please try again !"
      ;;
   esac
}

         


sudo -s
echo "\n|| IPtable Configure Script ||\n"
iptables -F
echo "Previous Configuration of IPtables have been flushed !\n"
menu
