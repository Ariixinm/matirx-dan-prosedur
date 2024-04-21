 program matrix;
 uses crt
 var
 a:array[1..3,1..3]of integer;
 i,j:integer;
 BEGIN
 CLRSCR;
 a[1,1]:=4;
a[1,2]:=5;
a[1,3]:=6;
a[2,1]:=7;
a[2,2]:=5;
a[2,3]:=7;
a[3,1]:=7;
a[3,2]:=2;
a[3,3]:=1;
fro i:= 1 to 3 do 
BEGIN
fro j:= 1 to 3 do 
BEGIN
write(A[i,j]:3);
end;
WRITELN;
end;
READLN;
end.