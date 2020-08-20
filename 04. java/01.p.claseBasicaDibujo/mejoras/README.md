# Mejoras
```java
void setX(int x)
{
	if(x>0 && x<800)
		this.x=x;
}
void setY(int y)
{
	if(y>0 && y<600)
		this.y=y;
}
void setLado(int lado)
{
	if(x>1 && x<600)
		this.lado=lado;
}
```


- Si usáis letra monoespaciada en las entregas es más legible (Courier por ejemplo)

# Errores
- Método getInfo?
- Había que usar x e y
- Nunca dejeis en el código, código comentado sino aporta
```java
		/*
		c1.setLado(100);
		c1.setCoord1(150);
		c1.setCoord2(300);

		c2.setLado(50);
		c2.setCoord1(0);
		c2.setCoord2(300);

		c3.setLado(150);
		c3.setCoord1(150);
		c3.setCoord2(0);
		*/
System.out.println("Primer cuadrado, con lado = " + c1.getLado() + " y situado en el : (" + c1.getCoord1() + "," + c1.getCoord2() + ")");
```

```java 
public static void main(String args[]){
//DEFINICIÓN DE CONSTANTES->PUEDO DEFINIR
CONSTANTES TAMBIÉN EN UN APP?
int LADO1=200;
int LADO2=100;
int LADO3=50;
int COORDENADAX=500;
int COORDENADAY=200;
```
```java
Util util1 = new Util();
util1.wait(1);
Util util2 = new Util();
util2.wait(1);
Util util3 = new Util();
util3.wait(1);
```

```java
public void setLado(int l){
	this.lado=l;
}
//ESTO ES TODAVÍA MAS FEO
public void setLado(int a)
{
	lado = a;
}
```

```java
public int getX()//Obtener el valor del lado de x
{
	return x;
}

public void setX(int x)//Determinar el valor de x
{
	this.x=x;
}
```


```java
public int[] getCoords()
{
	int[] vec = {x,y};
	return vec;
}
```

