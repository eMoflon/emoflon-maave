package org.moflon.maave.tool.smt.actheorysolver;

import org.moflon.maave.tool.symbolicgraphs.SymbolicGraphs.SymbolicGraph;

public class acTheorySolver {

	// private int ac_counter=0;
	// private HashMap<BoolExpr, AtomicCond>varToCondMap=new HashMap<BoolExpr,
	// AtomicCond>();

	public SymbolicGraph isSat(SymbolicGraph graphG) {
		return null;
	}
	// private BoolExpr getBoolExpr(Condition cond, Context ctx)
	// {
	// try {
	// if(cond instanceof TrueCond)
	// {
	// return ctx.mkBool(true);
	//
	// }
	// else if(cond instanceof NegCond)
	// {
	// NegCond negCond=(NegCond) cond;
	// return ctx.mkNot(getBoolExpr(negCond.getNegCondition(), ctx));
	// }
	// else if(cond instanceof AndCond)
	// {
	// AndCond andCond=(AndCond) cond;
	// if(andCond.getConditions().isEmpty())
	// {
	// return ctx.mkBool(false);
	// }
	// else
	// {
	// List<BoolExpr>
	// boolExpressions=andCond.getConditions().stream().map(x->this.getBoolExpr(x,
	// ctx)).collect(Collectors.toList());
	// return ctx.mkAnd((BoolExpr[]) boolExpressions.toArray());
	// }
	//
	// }
	// else if(cond instanceof AtomicCond)
	// {
	// BoolExpr x = ctx.mkBoolConst("ac!"+ac_counter++);
	// varToCondMap.put(x, (AtomicCond) cond);
	// return x;
	// }
	// } catch (Z3Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// return null;
	// }

	// private Model checkSat(Context ctx, BoolExpr f)
	// {
	// Solver s;
	// try {
	// s = ctx.mkSolver();
	// s.add(f);
	// if (s.check()== Status.SATISFIABLE)
	// return s.getModel();
	// else
	// return null;
	// } catch (Z3Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return null;
	// }
}
