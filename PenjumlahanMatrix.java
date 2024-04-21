program penjumlahanmatrix;
uses crt;
matrixA:array[1..3,1..3]of integer ;
matrixB:array[1..3,1..3]of integer;
i,j:integer;
BEGIN
CLRSCR;
WRITE('input matrix a :');
WRITELN;
for i := 1 to 3 do 
BEGIN
fofr j:= 1 to 3 do 
BEGIN
WRITE('baris ke - ',i,',kolom',j,':');readln(matrixA[i,j]);
end;
end;
for i:= 1 to 3 do 
BEGIN
for j := 1 to 3 do 
WRITE();
end;
WRITELN('input matrix b :');
for i:= 1 to 3 do 
BEGIN
for j : = 1 to 3 do 
BEGIN
WRITE('baris ke -',i,',kolom',j,'=');readln(matrixB[i,j]);
end;
end;
WRITELN();
for i:= 1 to 3 do 
BEGIN
 for j := 1 to 3 do 
 BEGIN
WRITE(matrixA[i,j],'');
end;
writeln();
end;
writeln();
writeln('hasil jumlah matrix A DAN B');
FOR I := 1 TO 3 DO 
BEGIN
FOR J:= 1 TO 3 DO
BEGIN
WRITE(matrixA[I,J]+matrixB[I,J],'');
END;
WRITELN;
END
READLNL;
END.


