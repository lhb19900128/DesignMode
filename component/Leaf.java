package com.liuhongbo.designmode.component;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {

	}

	@Override
	public void delete(Component c) {

	}

	@Override
	public void dispaly(int depth) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < depth; ++i)
			sb.append("-");
		System.out.println(sb.toString() + super.getName());
	}

}
