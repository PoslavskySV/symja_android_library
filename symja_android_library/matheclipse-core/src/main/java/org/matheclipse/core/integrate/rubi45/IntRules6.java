package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules6 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),Power(Plus(c_,Times(pd_DEFAULT,Power(x_,pn_))),CN1)),x_Symbol),
    Condition(Plus(Times(a,x,Power(c,CN1)),Times(Plus(Times(b,c),Times(CN1,a,pd)),Power(c,CN1),Int(Power(Plus(pd,Times(c,Power(x,Times(CN1,pn)))),CN1),x))),And(And(And(FreeQ(List(a,b,c,pd,pn),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),RationalQ(pn)),Less(pn,C0)))),
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),Power(Plus(c_,Times(pd_DEFAULT,Power(x_,pn_))),CN1)),x_Symbol),
    Condition(Plus(Times(b,x,Power(pd,CN1)),Times(CN1,Plus(Times(b,c),Times(CN1,a,pd)),Power(pd,CN1),Int(Power(Plus(c,Times(pd,Power(x,pn))),CN1),x))),And(And(FreeQ(List(a,b,c,pd,pn),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),Not(And(RationalQ(pn),Less(pn,C0)))))),
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),Power(Plus(c_,Times(pd_DEFAULT,Power(x_,pn_))),p_DEFAULT)),x_Symbol),
    Condition(Times(a,x,Power(Plus(c,Times(pd,Power(x,pn))),Plus(p,C1)),Power(c,CN1)),And(And(And(FreeQ(List(a,b,c,pd,pn,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),ZeroQ(Plus(Times(b,c),Times(CN1,a,pd,Plus(Times(pn,Plus(p,C1)),C1))))),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),Power(Plus(c_,Times(pd_DEFAULT,Power(x_,pn_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Plus(a,Times(b,Power(x,pn))),Power(Plus(c,Times(pd,Power(x,pn))),p)),x),x),And(And(And(FreeQ(List(a,b,c,pd,pn),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd,Plus(Times(pn,Plus(p,C1)),C1))))),PositiveIntegerQ(p)))),
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),Power(Plus(c_,Times(pd_DEFAULT,Power(x_,pn_))),p_)),x_Symbol),
    Condition(Plus(Times(Plus(Times(b,c),Times(CN1,a,pd)),x,Power(Plus(c,Times(pd,Power(x,pn))),Plus(p,C1)),Power(Times(c,pd,pn,Plus(p,C1)),CN1)),Times(CN1,Plus(Times(b,c),Times(CN1,a,pd,Plus(Times(pn,Plus(p,C1)),C1))),Power(Times(c,pd,pn,Plus(p,C1)),CN1),Int(Power(Plus(c,Times(pd,Power(x,pn))),Plus(p,C1)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd,Plus(Times(pn,Plus(p,C1)),C1))))),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),Power(Plus(c_,Times(pd_DEFAULT,Power(x_,pn_))),p_)),x_Symbol),
    Condition(Plus(Times(b,x,Power(Plus(c,Times(pd,Power(x,pn))),Plus(p,C1)),Power(Times(pd,Plus(Times(pn,Plus(p,C1)),C1)),CN1)),Times(CN1,Plus(Times(b,c),Times(CN1,a,pd,Plus(Times(pn,Plus(p,C1)),C1))),Power(Times(pd,Plus(Times(pn,Plus(p,C1)),C1)),CN1),Int(Power(Plus(c,Times(pd,Power(x,pn))),p),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd,Plus(Times(pn,Plus(p,C1)),C1))))),Not(PositiveIntegerQ(p))),Not(And(RationalQ(p),Less(p,CN1)))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),Plus(c_,Times(pd_DEFAULT,Power(x_,pn_)))),CN1),x_Symbol),
    Condition(Plus(Times(b,Power(Plus(Times(b,c),Times(CN1,a,pd)),CN1),Int(Power(Plus(a,Times(b,Power(x,pn))),CN1),x)),Times(CN1,pd,Power(Plus(Times(b,c),Times(CN1,a,pd)),CN1),Int(Power(Plus(c,Times(pd,Power(x,pn))),CN1),x))),And(FreeQ(List(a,b,c,pd,pn),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Power(x_,pn_)))),Power(Plus(c_,Times(pd_DEFAULT,Power(x_,pn_))),CN1)),x_Symbol),
    Condition(Plus(Times(b,Power(pd,CN1),Int(Power(Plus(a,Times(b,Power(x,pn))),CN1D2),x)),Times(CN1,Plus(Times(b,c),Times(CN1,a,pd)),Power(pd,CN1),Int(Power(Times(Sqrt(Plus(a,Times(b,Power(x,pn)))),Plus(c,Times(pd,Power(x,pn)))),CN1),x))),And(FreeQ(List(a,b,c,pd,pn),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,Sqr(x_))),Sqrt(Plus(c_,Times(pd_DEFAULT,Sqr(x_))))),CN1),x_Symbol),
    Condition(Subst(Int(Power(Simp(Plus(a,Times(Plus(Times(b,c),Times(CN1,a,pd)),Sqr(x))),x),CN1),x),x,Times(x,Power(Plus(c,Times(pd,Sqr(x))),CN1D2))),And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))))),
ISetDelayed(Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Sqrt(Plus(c_,Times(pd_DEFAULT,Sqr(x_))))),CN1),x_Symbol),
    Condition(Times(Power(Times(Sqrt(a),Sqrt(c),Rt(Times(CN1,pd,Power(c,CN1)),C2)),CN1),EllipticF(ArcSin(Times(Rt(Times(CN1,pd,Power(c,CN1)),C2),x)),Times(b,c,Power(Times(a,pd),CN1)))),And(And(And(FreeQ(List(a,b,c,pd),x),PositiveQ(a)),PositiveQ(c)),Not(SimplerSqrtQ(Times(CN1,b,Power(a,CN1)),Times(CN1,pd,Power(c,CN1))))))),
ISetDelayed(Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Sqrt(Plus(c_,Times(pd_DEFAULT,Sqr(x_))))),CN1),x_Symbol),
    Condition(Times(Sqrt(Times(Plus(a,Times(b,Sqr(x))),Power(a,CN1))),Sqrt(Times(Plus(c,Times(pd,Sqr(x))),Power(c,CN1))),Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(c,Times(pd,Sqr(x))))),CN1),Int(Power(Times(Sqrt(Plus(C1,Times(b,Power(a,CN1),Sqr(x)))),Sqrt(Plus(C1,Times(pd,Power(c,CN1),Sqr(x))))),CN1),x)),And(FreeQ(List(a,b,c,pd),x),Not(And(PositiveQ(a),PositiveQ(c)))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Power(Plus(c_,Times(pd_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(Sqrt(a),Power(Times(Sqrt(c),Rt(Times(CN1,pd,Power(c,CN1)),C2)),CN1),EllipticE(ArcSin(Times(Rt(Times(CN1,pd,Power(c,CN1)),C2),x)),Times(b,c,Power(Times(a,pd),CN1)))),And(And(FreeQ(List(a,b,c,pd),x),PositiveQ(a)),PositiveQ(c)))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Power(Plus(c_,Times(pd_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Times(Plus(c,Times(pd,Sqr(x))),Power(c,CN1))),Power(Times(Sqrt(Plus(c,Times(pd,Sqr(x)))),Sqrt(Times(Plus(a,Times(b,Sqr(x))),Power(a,CN1)))),CN1),Int(Times(Sqrt(Plus(C1,Times(b,Power(a,CN1),Sqr(x)))),Power(Plus(C1,Times(pd,Power(c,CN1),Sqr(x))),CN1D2)),x)),And(FreeQ(List(a,b,c,pd),x),Not(And(PositiveQ(a),PositiveQ(c)))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)))),Sqrt(Plus(c_,Times(pd_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Times(x,Sqrt(Plus(a,Times(b,Sqr(x)))),C1D3,Sqrt(Plus(c,Times(pd,Sqr(x))))),Times(C1D3,Int(Times(Plus(Times(C2,a,c),Times(Plus(Times(b,c),Times(a,pd)),Sqr(x))),Power(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Sqrt(Plus(c,Times(pd,Sqr(x))))),CN1)),x))),And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,Power(x_,C4))),Sqrt(Plus(c_,Times(pd_DEFAULT,Power(x_,C4))))),CN1),x_Symbol),
    Condition(Plus(Times(Power(Times(C2,a),CN1),Int(Power(Times(Plus(C1,Times(CN1,Rt(Times(CN1,b,Power(a,CN1)),C2),Sqr(x))),Sqrt(Plus(c,Times(pd,Power(x,C4))))),CN1),x)),Times(Power(Times(C2,a),CN1),Int(Power(Times(Plus(C1,Times(Rt(Times(CN1,b,Power(a,CN1)),C2),Sqr(x))),Sqrt(Plus(c,Times(pd,Power(x,C4))))),CN1),x))),And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))))),
ISetDelayed(Int(Power(Times(Plus(c_,Times(pd_DEFAULT,Power(x_,C4))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C4))),C1D4)),CN1),x_Symbol),
    Condition(Subst(Int(Power(Plus(c,Times(CN1,Plus(Times(b,c),Times(CN1,a,pd)),Power(x,C4))),CN1),x),x,Times(x,Power(Plus(a,Times(b,Power(x,C4))),CN1D4))),And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),p_DEFAULT)),x_Symbol),
    Condition(Int(PolynomialDivide(Power(Plus(a,Times(b,Power(x,pn))),m),Power(Plus(c,Times(pd,Power(x,pn))),Times(CN1,p)),x),x),And(And(And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),PositiveIntegerQ(pn,m,Times(CN1,p))),GreaterEqual(m,Times(CN1,p))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),m_),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),p_)),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,pd),Times(CN1,c,b)),x,Power(Plus(a,Times(b,Power(x,pn))),Plus(m,C1)),Power(Plus(c,Times(pd,Power(x,pn))),Plus(p,Times(CN1,C1))),Power(Times(a,b,pn,Plus(m,C1)),CN1)),Times(CN1,Power(Times(a,b,pn,Plus(m,C1)),CN1),Int(Times(Simp(Plus(Times(c,Plus(Times(a,pd),Times(CN1,c,b,Plus(Times(pn,Plus(m,C1)),C1)))),Times(pd,Plus(Times(a,pd,Plus(Times(pn,Plus(p,Times(CN1,C1))),C1)),Times(CN1,b,c,Plus(Times(pn,Plus(m,p)),C1))),Power(x,pn))),x),Power(Plus(a,Times(b,Power(x,pn))),Plus(m,C1)),Power(Plus(c,Times(pd,Power(x,pn))),Plus(p,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),RationalQ(m,p)),Less(m,CN1)),Greater(p,C1)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),m_),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,x,Power(Plus(a,Times(b,Power(x,pn))),Plus(m,C1)),Power(Plus(c,Times(pd,Power(x,pn))),p),Power(Times(a,pn,Plus(m,C1)),CN1)),Times(Power(Times(a,pn,Plus(m,C1)),CN1),Int(Times(Simp(Plus(Times(c,Plus(Times(pn,Plus(m,C1)),C1)),Times(pd,Plus(Times(pn,Plus(m,p,C1)),C1),Power(x,pn))),x),Power(Plus(a,Times(b,Power(x,pn))),Plus(m,C1)),Power(Plus(c,Times(pd,Power(x,pn))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),RationalQ(m,p)),Less(m,CN1)),And(Less(C0,p),LessEqual(p,C1))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),m_),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),p_DEFAULT)),x_Symbol),
    Condition(Times(CN1,b,x,Power(Plus(a,Times(b,Power(x,pn))),Plus(m,C1)),Power(Plus(c,Times(pd,Power(x,pn))),Plus(p,C1)),Power(Times(a,pn,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,pd))),CN1)),And(And(And(And(And(FreeQ(List(a,b,c,pd,pn,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),RationalQ(m)),Less(m,CN1)),ZeroQ(Plus(Times(pn,Plus(m,p,C2)),C1))),ZeroQ(Plus(Times(b,c),Times(pn,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,pd)))))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),m_),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,b,x,Power(Plus(a,Times(b,Power(x,pn))),Plus(m,C1)),Power(Plus(c,Times(pd,Power(x,pn))),Plus(p,C1)),Power(Times(a,pn,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,pd))),CN1)),Times(Plus(Times(b,c),Times(pn,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,pd)))),Power(Times(a,pn,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,pd))),CN1),Int(Times(Power(Plus(a,Times(b,Power(x,pn))),Plus(m,C1)),Power(Plus(c,Times(pd,Power(x,pn))),p)),x))),And(And(And(And(And(FreeQ(List(a,b,c,pd,pn,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),RationalQ(m)),Less(m,CN1)),ZeroQ(Plus(Times(pn,Plus(m,p,C2)),C1))),NonzeroQ(Plus(Times(b,c),Times(pn,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,pd)))))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),m_),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,b,x,Power(Plus(a,Times(b,Power(x,pn))),Plus(m,C1)),Power(Plus(c,Times(pd,Power(x,pn))),Plus(p,C1)),Power(Times(a,pn,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,pd))),CN1)),Times(Power(Times(a,pn,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,pd))),CN1),Int(Times(Simp(Plus(Times(b,c),Times(pn,Plus(m,C1),Plus(Times(b,c),Times(CN1,a,pd))),Times(pd,b,Plus(Times(pn,Plus(m,p,C2)),C1),Power(x,pn))),x),Power(Plus(a,Times(b,Power(x,pn))),Plus(m,C1)),Power(Plus(c,Times(pd,Power(x,pn))),p)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pn,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(Times(pn,Plus(m,p,C2)),C1))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,Power(x,pn))),m),Power(Plus(c,Times(pd,Power(x,pn))),p)),x),x),And(And(And(And(FreeQ(List(a,b,c,pd),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),PositiveIntegerQ(pn)),IntegersQ(m,p)),Greater(Plus(m,p),C0)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,pn_))),m_),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(x_,pn_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(pd,x,Power(Plus(a,Times(b,Power(x,pn))),Plus(m,C1)),Power(Plus(c,Times(pd,Power(x,pn))),Plus(p,Times(CN1,C1))),Power(Times(b,Plus(Times(pn,Plus(m,p)),C1)),CN1)),Times(Power(Times(b,Plus(Times(pn,Plus(m,p)),C1)),CN1),Int(Times(Simp(Plus(Times(c,Plus(Times(b,c,Plus(Times(pn,Plus(m,p)),C1)),Times(CN1,a,pd))),Times(pd,Plus(Times(b,c,Plus(Times(pn,Plus(m,Times(C2,p),Times(CN1,C1))),C1)),Times(CN1,a,pd,Plus(Times(pn,Plus(p,Times(CN1,C1))),C1))),Power(x,pn))),x),Power(Plus(a,Times(b,Power(x,pn))),m),Power(Plus(c,Times(pd,Power(x,pn))),Plus(p,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,pd,m,pn),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),RationalQ(p)),Greater(p,C1)),NonzeroQ(Plus(Times(pn,Plus(m,p)),C1))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,pn_))),m_DEFAULT),Power(Plus(c_,Times(pd_DEFAULT,Power(x_,pn_))),p_DEFAULT)),x_Symbol),
    Condition(Times(x,Power(Plus(a,Times(b,Power(x,pn))),m),Power(Plus(c,Times(pd,Power(x,pn))),p),Power(Times(Power(Plus(C1,Times(b,Power(x,pn),Power(a,CN1))),m),Power(Plus(C1,Times(pd,Power(x,pn),Power(c,CN1))),p)),CN1),AppellF1(Power(pn,CN1),Times(CN1,m),Times(CN1,p),Plus(C1,Power(pn,CN1)),Times(CN1,b,Power(x,pn),Power(a,CN1)),Times(CN1,pd,Power(x,pn),Power(c,CN1)))),And(And(FreeQ(List(a,b,c,pd,m,pn,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,pd)))),NonzeroQ(Plus(pn,C1))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(u_,pn_))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(pd_DEFAULT,Power(v_,pn_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Coefficient(u,x,C1),CN1),Subst(Int(Times(Power(Plus(a,Times(b,Power(x,pn))),m),Power(Plus(c,Times(pd,Power(x,pn))),p)),x),x,u)),And(And(And(FreeQ(List(a,b,c,pd,m,pn,p),x),ZeroQ(Plus(u,Times(CN1,v)))),LinearQ(u,x)),NonzeroQ(Plus(u,Times(CN1,x)))))),
ISetDelayed(Int(Times(Power(u_,m_DEFAULT),Power(v_,p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(ExpandToSum(v,x),p)),x),And(And(And(FreeQ(List(m,p),x),BinomialQ(List(u,v),x)),ZeroQ(Plus(BinomialDegree(u,x),Times(CN1,BinomialDegree(v,x))))),Not(BinomialMatchQ(List(u,v),x)))))
  );
}