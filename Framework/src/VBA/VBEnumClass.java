package VBA;

public class VBEnumClass extends VBVariant implements IResource, java.io.Serializable {
	

	// just flagging
	public VBEnumClass() 		  { super(0); }
	public VBEnumClass(int i)     { super(i); }
	public VBEnumClass(long l)    { super(l); }
	public VBEnumClass(String s)  { super(s); }
	/*
	public boolean equals(VBVariant o) {
		if (o == null) return false;
		try {
			if (this == o){
				return true;
			} else {
				if (o.toString().trim().toLowerCase().equals(this.toString().trim().toLowerCase())) {
					return true;
				} else {
					return false;
				}
			}
		} catch (Exception e1) {
			return false;
		}
	}*/
	/**
	 * returns the name of this constant
	 */
	public String getName() throws Exception {
		java.lang.reflect.Field[] fs = this.getClass().getFields();		
		VBVariant vthis = (VBVariant)this;
		long lvthis = vthis.longValue();
		String s = getName1(fs, vthis);
		if (s == null) {
			s = "";
			VBVariant[] vs = this.getEnumValues();
			long lv = 0;
			for (int i = 0; i < vs.length; ++i) {
				lv = vs[i].longValue();
				if ((lvthis & lv) == lv) {
					s = s + " " + getName1(fs, vs[i]);
				}
			}
		}
		return s;
	}
	private String getName1(java.lang.reflect.Field[] fs, VBVariant vthis) throws Exception {
		VBVariant v = null;
		String s = null;
		for (int i = 0; i < fs.length; ++i) {
		   v = (VBVariant)fs[i].get(this);
		   if (vthis.compareTo(v) == 0) {
				s = fs[i].getName();
				break;
		   }
		}
		return s;
	}
	/**
	 * returns an array of names of all constant static fields of the enum
	 */
	public String[] getEnumNames() {
		java.lang.reflect.Field[] fs = this.getClass().getFields();
		String[] s = new String[fs.length];
		for (int i = 0; i < fs.length; ++i) {
			s[i] = fs[i].getName();
		}
		return s;
    }
	/**
	 * returns an array of values of all constant static fields of the enum
	 */
	public VBVariant[] getEnumValues() throws Exception {
		java.lang.reflect.Field[] fs = this.getClass().getFields();
		VBVariant[] v = new VBVariant[fs.length];
		for (int i = 0; i < fs.length; ++i) {
			v[i] = (VBVariant)fs[i].get(this);
		}
		return v;
    }	
}
