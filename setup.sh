echo "Setting up project"
export JNIMDIR=$PWD
cd lib/
wget https://bitbucket.org/xerial/sqlite-jdbc/downloads/sqlite-jdbc-3.14.2.jar
cat "export CLASSPATH=$CLASSPATH:$JNUMDIR/lib/sqlite-jdbc-3.14.2.jar" >> ~/.bashrc

cd $JNIMDIR

javac -d bin/ src/*.java

echo "FINISHED \n Now you can start JNim, just type \'java -cp bin/ JNim"