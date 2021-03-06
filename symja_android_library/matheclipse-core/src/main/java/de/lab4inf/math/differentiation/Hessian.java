/*
 * Project: Lab4Math
 *
 * Copyright (c) 2008-2009,  Prof. Dr. Nikolaus Wulff
 * University of Applied Sciences, Muenster, Germany
 * Lab for Computer sciences (Lab4Inf).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*/
package de.lab4inf.math.differentiation;

/**
 * Interface for the hessian matrix d**2f/dx[j]**2
 * of a real valued function.
 *
 * @author Prof. Dr. Nikolaus Wulff
 * @version $Id: Hessian.java,v 1.2 2010/02/25 15:31:54 nwulff Exp $
 * @since 13.10.2007
 */

public interface Hessian {
    /**
     * Calculate the hessian matrix at arguments x.
     *
     * @param x this input arguments
     * @return double[][] the hessian matrix
     */
    double[][] hessian(double... x);

}
 