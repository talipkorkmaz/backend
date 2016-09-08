# Campaign Management

### API
---

 * The Swagger UI is accessible at [http://localhost:8080/swagger-ui.html]()

 * The Swagger v2 definition is accessible at [http://localhost:8080/v2/api-docs]()
  
### HikariCP configuration options
---
      hikaricp {

        # The datasource class name, if not using a URL
        dataSourceClassName = null

        # Data source configuration options
        dataSource {
        }

        # Whether autocommit should be used
        autoCommit = true

        # The connection timeout
        connectionTimeout = 30 seconds

        # The idle timeout
        idleTimeout = 10 minutes

        # The max lifetime of a connection
        maxLifetime = 30 minutes

        # If non null, the query that should be used to test connections
        connectionTestQuery = null

        # If non null, sets the minimum number of idle connections to maintain.
        minimumIdle = null

        # The maximum number of connections to make.
        maximumPoolSize = 10

        # If non null, sets the name of the connection pool. Primarily used for stats reporting.
        poolName = null

        # Sets whether or not construction of the pool should fail if the minimum number of connections
        # coludn't be created.
        initializationFailFast = true

        # Sets whether internal queries should be isolated
        isolateInternalQueries = false

        # Sets whether pool suspension is allowed.  There is a performance impact to enabling it.
        allowPoolSuspension = false

        # Sets whether connections should be read only
        readOnly = false

        # Sets whether mbeans should be registered
        registerMbeans = false

        # If non null, sets the catalog that should be used on connections
        catalog = null

        # A SQL statement that will be executed after every new connection creation before adding it to the pool
        connectionInitSql = null

        # If non null, sets the transaction isolation level
        transactionIsolation = null

        # The validation timeout to use
        validationTimeout = 5 seconds

        # If non null, sets the threshold for the amount of time that a connection has been out of the pool before it is
        # considered to have leaked
        leakDetectionThreshold = null
      }
drools, springboot
