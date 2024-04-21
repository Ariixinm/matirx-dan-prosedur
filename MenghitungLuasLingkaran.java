program MenghitungLuasLingkaran;
uses crt;
const
phi = 3.14;
type
realnumber = type double;
procedure LuasLingkaran(r : REALNUMBER; VAR HASIL ;REALNUMBER);
BEGIN
HASIL:= phi * r * r;
end;
var
jarijari,LUAS;REALNUMBER;
BEGIN
CLRSCRL
WRITE('MASUKAN JARI JARI LINGKARAN :');READLN(JARIJARI);
LUASLINGKARAN(JARIJARI,LUAS);
WRITELN('MASUKAN LINGKARAN ADAKAH :',LUAS:0:2);
REALDL
END.