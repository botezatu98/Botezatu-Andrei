package Interfete;

public class Cerc implements Shape {

	private int radius;
	private int borderWidth;
	private String fillColor;
	private HexColorValidator validate;
	private BorderClassValidator validateB;
	private static final String NUME_CONSTANTA = "Cerc";

	public Cerc(int radius,String fillColor,int borderWidth) {
		this.radius = radius;
	this.fillColor=fillColor;
	this.borderWidth=borderWidth;
	this.validateB=new BorderClassValidator();
	this.validate = new HexColorValidator();
	}

	@Override
	public void draw() {
		if (radius > 0) {
			double dist;
			for (int i = 0; i <= 2 * radius; i++) {
				for (int j = 0; j <= 2 * radius; j++) {
					dist = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));
					if (dist > radius - 0.5 && dist < radius + 0.5)
						System.out.print("*");
					else
						System.out.print(" ");
				}

				System.out.print("\n");
			}
		} else
			throw new IllegalArgumentException("Ati introdus un numar negativ");
	}

	@Override
	public double getArea() {
		if(radius>0)
		{
		float pi=(float) 3.14;
		// TODO Auto-generated method stub
		return pi*radius*radius;
		}else throw new IllegalArgumentException("Ati introdus un numar negativ");
		}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return NUME_CONSTANTA;
	}

	@Override
	public String getHexFillColor() {
		boolean a = validate.validate(fillColor);

		if (a == true)
			return fillColor;

		return "\0";
	}

	@Override
	public int getBorderWidth() {
		boolean a = validateB.validate(borderWidth);
		if (a == true)
			return borderWidth;

		return 0;
	}

}
