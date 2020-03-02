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
package org.evosuite.symbolic.DSE.algorithm.strategies.implementations.KeepSearchingCriteriaStrategies;

import org.evosuite.symbolic.DSE.algorithm.strategies.KeepSearchingCriteriaStrategy;
import org.evosuite.testcase.TestCase;

import java.util.List;

/**
 * Strategy for keep searching in case a new test case was generated in the last execution
 *
 * @author ignacio lebrero
 */
public class LastExecutionCreatedATestCaseStrategy implements KeepSearchingCriteriaStrategy {
    @Override
    public boolean ShouldKeepSearching(List<TestCase> generatedTests) {
        return false;
    }
}
