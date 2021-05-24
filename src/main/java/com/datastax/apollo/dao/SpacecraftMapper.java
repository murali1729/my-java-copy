package com.datastax.apollo.dao;

import com.datastax.oss.driver.api.core.CqlIdentifier;
import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.DaoKeyspace;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;

/**
 * Wrapper for all {@link Dao} generated by DataStax Driver.
 */
@Mapper
public interface SpacecraftMapper {

    /**
     * Initialization of Dao {@link RatingDseDao}
     *
     * @param keyspace
     *      working keyspace name
     * @return
     *      instanciation with the mappers
     */
    @DaoFactory
    SpacecraftJourneyDao spacecraftJourneyDao(@DaoKeyspace CqlIdentifier keyspace);
    
    @DaoFactory
    SpacecraftInstrumentsDao spacecraftInstrumentsDao(@DaoKeyspace CqlIdentifier keyspace);
    
}
