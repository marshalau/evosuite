/**
 * Copyright (C) 2010-2020 Gordon Fraser, Andrea Arcuri and EvoSuite
 * contributors
 *
 * This file is part of EvoSuite.
 *
 * EvoSuite is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3.0 of the License, or
 * (at your option) any later version.
 *
 * EvoSuite is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with EvoSuite. If not, see <http://www.gnu.org/licenses/>.
 */
package org.evosuite.symbolic.DSE.algorithm.strategies.implementations.PathSelectionStrategies;

import org.evosuite.symbolic.DSE.algorithm.strategies.PathSelectionStrategy;
import org.evosuite.symbolic.PathCondition;
import org.evosuite.symbolic.expr.Constraint;
import org.evosuite.symbolic.solver.SolverUtils;

import java.util.List;

/**
 * Strategy for negate the last condition as the next path condition to explore
 *
 * @author ignacio lebrero
 */
public class NegateLastConditionStrategy implements PathSelectionStrategy {
    @Override
    public List<Constraint<?>> getNextPathConstraints(PathCondition currentPathCondition) {
        return SolverUtils.buildQueryNegatingIthCondition(
                currentPathCondition,
                currentPathCondition.size() - 1
        );
    }
}
