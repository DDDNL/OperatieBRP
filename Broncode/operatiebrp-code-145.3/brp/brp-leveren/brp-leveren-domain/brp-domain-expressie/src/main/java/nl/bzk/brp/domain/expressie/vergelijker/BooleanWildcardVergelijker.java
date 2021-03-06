/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.domain.expressie.vergelijker;

import nl.bzk.brp.domain.expressie.Expressie;
import nl.bzk.brp.domain.expressie.ExpressieType;
import nl.bzk.brp.domain.expressie.OperatorType;
import nl.bzk.brp.domain.expressie.BooleanLiteral;
import org.springframework.stereotype.Component;

/**
 * {@link OperatorType#WILDCARD} vergelijker voor {@link ExpressieType#BOOLEAN} expressies.
 */
@Component
@VergelijkerConfig(operator = OperatorType.WILDCARD, typeSupport = ExpressieType.BOOLEAN)
final class BooleanWildcardVergelijker implements Vergelijker<BooleanLiteral, BooleanLiteral> {

    private static final BooleanGelijkVergelijker BOOLEAN_GELIJK_VERGELIJKER = new BooleanGelijkVergelijker();

    @Override
    public Expressie apply(final BooleanLiteral l, final BooleanLiteral r) {
        return BOOLEAN_GELIJK_VERGELIJKER.apply(l, r);
    }
}
