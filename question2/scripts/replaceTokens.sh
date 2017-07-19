
if [ -z "$1" ]; then
    echo "Argument 1 (input file name) is not provided" 
    exit 1
fi

if [ -z "$2" ]; then
   echo "Argument 2 (properties file name) is not provided" 
   exit 1
fi

if [ -z "$3" ]; then
   echo "Argument 3 (output file name) is not provided" 
   exit 1
fi

input_file="$1"
if [ ! -e "$input_file" ] ; then
    echo "The input file does not exist"
    exit 1
fi

properties_file="$2"
if [ ! -e "$properties_file" ] ; then
    echo "The properties file does not exist "
    exit 1
fi

output_file="$3"

# Read configuration into an associative array
declare -A CONFIG

# IFS is the 'internal field separator'.
IFS="="
while read -r key value
do
    if [ -n $value ]; then
        CONFIG[$key]=$value
    else
        CONFIG[$key]=$value
    fi
done < $properties_file
unset IFS


sudo cp $input_file $output_file

for key in "${!CONFIG[@]}"
   do
      sudo sed -i ''  "s/\[\[$key\]\]/${CONFIG[$key]}/g" $output_file
   done

exit $?
