/*
*  Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.apache.synapse.transport.passthru.config;

/**
 * Defines configuration parameter names for Pass-through HTTP Transport.
 */
public interface PassThroughConfigPNames {

    /**
     * Defines the core size (number of threads) of the worker thread pool.
     */
    public String WORKER_POOL_SIZE_CORE = "worker_pool_size_core";

    /**
     * Defines the maximum size (number of threads) of the worker thread pool.
     */
    public String WORKER_POOL_SIZE_MAX = "worker_pool_size_max";

    /**
     * Defines the keep-alive time for extra threads in the worker pool.
     */
    public String WORKER_THREAD_KEEP_ALIVE_SEC = "worker_thread_keepalive_sec";

    /**
     * Defines the length of the queue that is used to hold Runnable tasks to be executed by the
     * worker pool.
     */
    public String WORKER_POOL_QUEUE_LENGTH = "worker_pool_queue_length";

    /**
     * Defines the number of IO dispatcher threads used per reactor
     */
    public String IO_THREADS_PER_REACTOR = "io_threads_per_reactor";

    /**
     * Defines the core size (number of threads) of the secondary worker thread pool.
     */
    public String SECONDARY_WORKER_POOL_SIZE_CORE = "secondary_worker_pool_size_core";

    /**
     * Defines the maximum size (number of threads) of the secondary worker thread pool.
     */
    public String SECONDARY_WORKER_POOL_SIZE_MAX = "secondary_worker_pool_size_max";

    /**
     * Defines the keep-alive time for extra threads in the secondary worker pool.
     */
    public String SECONDARY_WORKER_THREAD_KEEPALIVE_SEC = "secondary_worker_thread_keepalive_sec";

    /**
     * Defines the length of the queue that is used to hold Runnable tasks to be executed by the
     * secondary worker pool.
     */
    public String SECONDARY_WORKER_POOL_QUEUE_LENGTH = "secondary_worker_pool_queue_length";
    /**
     * Defines the IO buffer size
     */
    public String IO_BUFFER_SIZE = "io_buffer_size";


    /**
     * Defines the maximum open connection limit.
     */
   public String C_MAX_ACTIVE = "max_open_connections";

    /**
     * Defines whether ESB needs to preserve the original User-Agent header.
     */
    public String USER_AGENT_HEADER_PRESERVE = "http.user.agent.preserve";

    /**
     * Defines whether ESB needs to preserve the original Server header.
     */
    public String SERVER_HEADER_PRESERVE = "http.server.preserve";

    /**
     * Defines whether ESB needs to preserve the original Http header.
     */
    public String HTTP_HEADERS_PRESERVE = "http.headers.preserve";

    /**
     * Defines whether ESB needs to preserve the original Http header.
     */
    public String HTTP_RESPONSE_HEADERS_PRESERVE = "http.response.headers.preserve";

    /**
     * Defines whether HTTP keep-alive is disabled
     */
    public String DISABLE_KEEPALIVE = "http.connection.disable.keepalive";


    /**
     * Define property to mark If an error has happened in the request processing,
     * should consumes the data in pipe completely and discard.
     */
    public String CONSUME_AND_DISCARD = "consume_and_discard";

    /**
     * Define property to mark If an error has happened in the request processing,
     * should consume the data in pipe completely and discard using secondary worker pool.
     */
    public String CONSUME_AND_DISCARD_BY_SECONDARY_POOL = "consume_and_discard_by_secondary_pool";

    /**
     * Defines whether we should close target connection on endpoint timeout.
     */
    public String CLOSE_SOCKET_ON_ENDPOINT_TIMEOUT = "close_socket_on_endpoint_timeout";

    /**
     * Defines the time interval for idle connection removal.
     */
    public String CONNECTION_IDLE_TIME = "transport.sender.connection.idle.time";

    /**
     * Defines the time allocated to avoid a connection being used
     * at the moment it is being closed or timed out in milliseconds
     */
    public String CONNECTION_GRACE_TIME = "transport.sender.connection.grace.time";

    /**
     * Defines the time interval for maximum connection lifespan.
     */
    public String MAXIMUM_CONNECTION_LIFESPAN = "transport.sender.connection.maximum.lifespan";


    /**
     * Defines the maximum number of connections per host port
     */
    public String MAX_CONNECTION_PER_HOST_PORT = "http.max.connection.per.host.port";

    public String TRANSPORT_LISTENER_SHUTDOWN_WAIT_TIME_SEC = "transport.listener.shutdown.wait.sec";

    /**
     * Defines whether Listening IOReactor is shared among non axis2 Listeners
     */
    public String HTTP_LISTENING_IO_REACTOR_SHARING_ENABLE ="http_listening_io_reactor_sharing_enable";

    /**
     * Defines the header name set for correlation logs
     */
    public String CORRELATION_HEADER_NAME_PROPERTY = "correlation_header_name";

    /**
     * Defines max waiting time for a request to be queued for a worker thread
     */
    public String EXPECTED_MAX_QUEUEING_TIME = "expected_max_queueing_time";

    /**
     * Defines max waiting time for a request to be queued for a worker thread
     */
    public String EXPECTED_MAX_QUEUEING_TIME_FOR_MESSAGE_DISCARD_WORKER
            = "expected_max_queueing_time_for_message_discard_worker";
}
