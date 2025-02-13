/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.awsddbstreamssource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAwsddbstreamssourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_TABLE_CONF = "camel.kamelet.aws-ddb-streams-source.table";
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_TABLE_DOC = "Name of the DynamoDB table to look at";
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_TABLE_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_ACCESS_KEY_CONF = "camel.kamelet.aws-ddb-streams-source.accessKey";
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_ACCESS_KEY_DOC = "The access key obtained from AWS";
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_SECRET_KEY_CONF = "camel.kamelet.aws-ddb-streams-source.secretKey";
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_SECRET_KEY_DOC = "The secret key obtained from AWS";
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_REGION_CONF = "camel.kamelet.aws-ddb-streams-source.region";
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_REGION_DOC = "The AWS region to connect to Example: eu-west-1";
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_REGION_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_ITERATOR_TYPE_CONF = "camel.kamelet.aws-ddb-streams-source.iteratorType";
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_ITERATOR_TYPE_DOC = "Defines where in the DynaboDB stream to start getting records. Note that using TRIM_HORIZON can cause a significant delay before the stream has caught up to real-time. if {AT,AFTER}_SEQUENCE_NUMBER are used, then a sequenceNumberProvider MUST be supplied. There are 4 enums and the value can be one of TRIM_HORIZON, LATEST, AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER";
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_ITERATOR_TYPE_DEFAULT = "LATEST";
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_SEQUENCE_NUMBER_PROVIDER_CONF = "camel.kamelet.aws-ddb-streams-source.sequenceNumberProvider";
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_SEQUENCE_NUMBER_PROVIDER_DOC = "Provider for the sequence number when using one of the two ShardIteratorType AT_SEQUENCE_NUMBER or AFTER_SEQUENCE_NUMBER iterator types. Can be a registry reference or a literal sequence number. Example: 900000000005745712447";
    public static final String CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_SEQUENCE_NUMBER_PROVIDER_DEFAULT = "000000000000000000000";

    public CamelAwsddbstreamssourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAwsddbstreamssourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_TABLE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_TABLE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_TABLE_DOC);
        conf.define(CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_ACCESS_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_ACCESS_KEY_DOC);
        conf.define(CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_SECRET_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_SECRET_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_SECRET_KEY_DOC);
        conf.define(CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_REGION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_REGION_DOC);
        conf.define(CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_ITERATOR_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_ITERATOR_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_ITERATOR_TYPE_DOC);
        conf.define(CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_SEQUENCE_NUMBER_PROVIDER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_SEQUENCE_NUMBER_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSDDBSTREAMSSOURCE_KAMELET_SEQUENCE_NUMBER_PROVIDER_DOC);
        return conf;
    }
}