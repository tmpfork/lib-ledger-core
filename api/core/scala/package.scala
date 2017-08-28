// AUTOGENERATED FILE - DO NOT MODIFY!

package co.ledger.core

import java.util.ArrayList
import java.util.Date
import java.util.HashMap
import scala.collection.JavaConverters._
import scala.concurrent.{Future, Promise}

package object implicits {
    class LedgerCoreWrappedException(val code: ErrorCode, message: String) extends Exception(message)
    class UnknownNetworkParametersException(message: String) extends LedgerCoreWrappedException(ErrorCode.UNKNOWN_NETWORK_PARAMETERS, message)
    class EcPrivKeyInvalidFormatException(message: String) extends LedgerCoreWrappedException(ErrorCode.EC_PRIV_KEY_INVALID_FORMAT, message)
    class EcPubKeyInvalidException(message: String) extends LedgerCoreWrappedException(ErrorCode.EC_PUB_KEY_INVALID, message)
    class EcDerSignatureInvalidException(message: String) extends LedgerCoreWrappedException(ErrorCode.EC_DER_SIGNATURE_INVALID, message)
    class EcSignFailedException(message: String) extends LedgerCoreWrappedException(ErrorCode.EC_SIGN_FAILED, message)
    class WalletNotFoundException(message: String) extends LedgerCoreWrappedException(ErrorCode.WALLET_NOT_FOUND, message)
    class WalletAlreadyExistsException(message: String) extends LedgerCoreWrappedException(ErrorCode.WALLET_ALREADY_EXISTS, message)
    class RawTransactionNotFoundException(message: String) extends LedgerCoreWrappedException(ErrorCode.RAW_TRANSACTION_NOT_FOUND, message)
    class AccountAlreadyExistsException(message: String) extends LedgerCoreWrappedException(ErrorCode.ACCOUNT_ALREADY_EXISTS, message)
    class CancelledByUserException(message: String) extends LedgerCoreWrappedException(ErrorCode.CANCELLED_BY_USER, message)
    class UnsupportedCurrencyException(message: String) extends LedgerCoreWrappedException(ErrorCode.UNSUPPORTED_CURRENCY, message)
    class CurrencyAlreadyExistsException(message: String) extends LedgerCoreWrappedException(ErrorCode.CURRENCY_ALREADY_EXISTS, message)
    class CurrencyNotFoundException(message: String) extends LedgerCoreWrappedException(ErrorCode.CURRENCY_NOT_FOUND, message)
    class CurrencyUnitNotFoundException(message: String) extends LedgerCoreWrappedException(ErrorCode.CURRENCY_UNIT_NOT_FOUND, message)
    class InvalidBase58FormatException(message: String) extends LedgerCoreWrappedException(ErrorCode.INVALID_BASE58_FORMAT, message)
    class InvalidChecksumException(message: String) extends LedgerCoreWrappedException(ErrorCode.INVALID_CHECKSUM, message)
    class InvalidVersionException(message: String) extends LedgerCoreWrappedException(ErrorCode.INVALID_VERSION, message)
    class PrivateDerivationNotSupportedException(message: String) extends LedgerCoreWrappedException(ErrorCode.PRIVATE_DERIVATION_NOT_SUPPORTED, message)
    class InvalidNetworkAddressVersionException(message: String) extends LedgerCoreWrappedException(ErrorCode.INVALID_NETWORK_ADDRESS_VERSION, message)
    class RuntimeErrorException(message: String) extends LedgerCoreWrappedException(ErrorCode.RUNTIME_ERROR, message)
    class OutOfRangeException(message: String) extends LedgerCoreWrappedException(ErrorCode.OUT_OF_RANGE, message)
    class IllegalArgumentException(message: String) extends LedgerCoreWrappedException(ErrorCode.ILLEGAL_ARGUMENT, message)
    class InvalidArgumentException(message: String) extends LedgerCoreWrappedException(ErrorCode.INVALID_ARGUMENT, message)
    class IllegalStateException(message: String) extends LedgerCoreWrappedException(ErrorCode.ILLEGAL_STATE, message)
    class NullPointerException(message: String) extends LedgerCoreWrappedException(ErrorCode.NULL_POINTER, message)
    class UnsupportedOperationException(message: String) extends LedgerCoreWrappedException(ErrorCode.UNSUPPORTED_OPERATION, message)
    class UnknownException(message: String) extends LedgerCoreWrappedException(ErrorCode.UNKNOWN, message)
    class ImplementationIsMissingException(message: String) extends LedgerCoreWrappedException(ErrorCode.IMPLEMENTATION_IS_MISSING, message)
    class FutureWasSuccessfullException(message: String) extends LedgerCoreWrappedException(ErrorCode.FUTURE_WAS_SUCCESSFULL, message)
    class AlreadyCompletedException(message: String) extends LedgerCoreWrappedException(ErrorCode.ALREADY_COMPLETED, message)
    class NoSuchElementException(message: String) extends LedgerCoreWrappedException(ErrorCode.NO_SUCH_ELEMENT, message)
    class UnableToOpenLeveldbException(message: String) extends LedgerCoreWrappedException(ErrorCode.UNABLE_TO_OPEN_LEVELDB, message)
    class NoInternetConnectivityException(message: String) extends LedgerCoreWrappedException(ErrorCode.NO_INTERNET_CONNECTIVITY, message)
    class UnableToResolveHostException(message: String) extends LedgerCoreWrappedException(ErrorCode.UNABLE_TO_RESOLVE_HOST, message)
    class UnableToConnectToHostException(message: String) extends LedgerCoreWrappedException(ErrorCode.UNABLE_TO_CONNECT_TO_HOST, message)
    class HttpErrorException(message: String) extends LedgerCoreWrappedException(ErrorCode.HTTP_ERROR, message)
    class SslErrorException(message: String) extends LedgerCoreWrappedException(ErrorCode.SSL_ERROR, message)
    class TooManyRedirectException(message: String) extends LedgerCoreWrappedException(ErrorCode.TOO_MANY_REDIRECT, message)
    class AuthenticationRequiredException(message: String) extends LedgerCoreWrappedException(ErrorCode.AUTHENTICATION_REQUIRED, message)
    class HttpTimeoutException(message: String) extends LedgerCoreWrappedException(ErrorCode.HTTP_TIMEOUT, message)
    class ProxyErrorException(message: String) extends LedgerCoreWrappedException(ErrorCode.PROXY_ERROR, message)
    class ApiErrorException(message: String) extends LedgerCoreWrappedException(ErrorCode.API_ERROR, message)
    class TransactionNotFoundException(message: String) extends LedgerCoreWrappedException(ErrorCode.TRANSACTION_NOT_FOUND, message)
    class InvalidDateFormatException(message: String) extends LedgerCoreWrappedException(ErrorCode.INVALID_DATE_FORMAT, message)
    class InvalidDerivationSchemeException(message: String) extends LedgerCoreWrappedException(ErrorCode.INVALID_DERIVATION_SCHEME, message)
    class UnknownKeychainEngineException(message: String) extends LedgerCoreWrappedException(ErrorCode.UNKNOWN_KEYCHAIN_ENGINE, message)
    class UnknownBlockchainExplorerEngineException(message: String) extends LedgerCoreWrappedException(ErrorCode.UNKNOWN_BLOCKCHAIN_EXPLORER_ENGINE, message)
    class UnknownBlockchainObserverEngineException(message: String) extends LedgerCoreWrappedException(ErrorCode.UNKNOWN_BLOCKCHAIN_OBSERVER_ENGINE, message)
    class UnknownSynchronizationEngineException(message: String) extends LedgerCoreWrappedException(ErrorCode.UNKNOWN_SYNCHRONIZATION_ENGINE, message)
    class BadCastException(message: String) extends LedgerCoreWrappedException(ErrorCode.BAD_CAST, message)
    class LinkNonTailFilterException(message: String) extends LedgerCoreWrappedException(ErrorCode.LINK_NON_TAIL_FILTER, message)
    private def wrapLedgerCoreError(error: co.ledger.core.Error): LedgerCoreWrappedException = {
        error.getCode match {
            case ErrorCode.UNKNOWN_NETWORK_PARAMETERS => new UnknownNetworkParametersException(error.getMessage)
            case ErrorCode.EC_PRIV_KEY_INVALID_FORMAT => new EcPrivKeyInvalidFormatException(error.getMessage)
            case ErrorCode.EC_PUB_KEY_INVALID => new EcPubKeyInvalidException(error.getMessage)
            case ErrorCode.EC_DER_SIGNATURE_INVALID => new EcDerSignatureInvalidException(error.getMessage)
            case ErrorCode.EC_SIGN_FAILED => new EcSignFailedException(error.getMessage)
            case ErrorCode.WALLET_NOT_FOUND => new WalletNotFoundException(error.getMessage)
            case ErrorCode.WALLET_ALREADY_EXISTS => new WalletAlreadyExistsException(error.getMessage)
            case ErrorCode.RAW_TRANSACTION_NOT_FOUND => new RawTransactionNotFoundException(error.getMessage)
            case ErrorCode.ACCOUNT_ALREADY_EXISTS => new AccountAlreadyExistsException(error.getMessage)
            case ErrorCode.CANCELLED_BY_USER => new CancelledByUserException(error.getMessage)
            case ErrorCode.UNSUPPORTED_CURRENCY => new UnsupportedCurrencyException(error.getMessage)
            case ErrorCode.CURRENCY_ALREADY_EXISTS => new CurrencyAlreadyExistsException(error.getMessage)
            case ErrorCode.CURRENCY_NOT_FOUND => new CurrencyNotFoundException(error.getMessage)
            case ErrorCode.CURRENCY_UNIT_NOT_FOUND => new CurrencyUnitNotFoundException(error.getMessage)
            case ErrorCode.INVALID_BASE58_FORMAT => new InvalidBase58FormatException(error.getMessage)
            case ErrorCode.INVALID_CHECKSUM => new InvalidChecksumException(error.getMessage)
            case ErrorCode.INVALID_VERSION => new InvalidVersionException(error.getMessage)
            case ErrorCode.PRIVATE_DERIVATION_NOT_SUPPORTED => new PrivateDerivationNotSupportedException(error.getMessage)
            case ErrorCode.INVALID_NETWORK_ADDRESS_VERSION => new InvalidNetworkAddressVersionException(error.getMessage)
            case ErrorCode.RUNTIME_ERROR => new RuntimeErrorException(error.getMessage)
            case ErrorCode.OUT_OF_RANGE => new OutOfRangeException(error.getMessage)
            case ErrorCode.ILLEGAL_ARGUMENT => new IllegalArgumentException(error.getMessage)
            case ErrorCode.INVALID_ARGUMENT => new InvalidArgumentException(error.getMessage)
            case ErrorCode.ILLEGAL_STATE => new IllegalStateException(error.getMessage)
            case ErrorCode.NULL_POINTER => new NullPointerException(error.getMessage)
            case ErrorCode.UNSUPPORTED_OPERATION => new UnsupportedOperationException(error.getMessage)
            case ErrorCode.UNKNOWN => new UnknownException(error.getMessage)
            case ErrorCode.IMPLEMENTATION_IS_MISSING => new ImplementationIsMissingException(error.getMessage)
            case ErrorCode.FUTURE_WAS_SUCCESSFULL => new FutureWasSuccessfullException(error.getMessage)
            case ErrorCode.ALREADY_COMPLETED => new AlreadyCompletedException(error.getMessage)
            case ErrorCode.NO_SUCH_ELEMENT => new NoSuchElementException(error.getMessage)
            case ErrorCode.UNABLE_TO_OPEN_LEVELDB => new UnableToOpenLeveldbException(error.getMessage)
            case ErrorCode.NO_INTERNET_CONNECTIVITY => new NoInternetConnectivityException(error.getMessage)
            case ErrorCode.UNABLE_TO_RESOLVE_HOST => new UnableToResolveHostException(error.getMessage)
            case ErrorCode.UNABLE_TO_CONNECT_TO_HOST => new UnableToConnectToHostException(error.getMessage)
            case ErrorCode.HTTP_ERROR => new HttpErrorException(error.getMessage)
            case ErrorCode.SSL_ERROR => new SslErrorException(error.getMessage)
            case ErrorCode.TOO_MANY_REDIRECT => new TooManyRedirectException(error.getMessage)
            case ErrorCode.AUTHENTICATION_REQUIRED => new AuthenticationRequiredException(error.getMessage)
            case ErrorCode.HTTP_TIMEOUT => new HttpTimeoutException(error.getMessage)
            case ErrorCode.PROXY_ERROR => new ProxyErrorException(error.getMessage)
            case ErrorCode.API_ERROR => new ApiErrorException(error.getMessage)
            case ErrorCode.TRANSACTION_NOT_FOUND => new TransactionNotFoundException(error.getMessage)
            case ErrorCode.INVALID_DATE_FORMAT => new InvalidDateFormatException(error.getMessage)
            case ErrorCode.INVALID_DERIVATION_SCHEME => new InvalidDerivationSchemeException(error.getMessage)
            case ErrorCode.UNKNOWN_KEYCHAIN_ENGINE => new UnknownKeychainEngineException(error.getMessage)
            case ErrorCode.UNKNOWN_BLOCKCHAIN_EXPLORER_ENGINE => new UnknownBlockchainExplorerEngineException(error.getMessage)
            case ErrorCode.UNKNOWN_BLOCKCHAIN_OBSERVER_ENGINE => new UnknownBlockchainObserverEngineException(error.getMessage)
            case ErrorCode.UNKNOWN_SYNCHRONIZATION_ENGINE => new UnknownSynchronizationEngineException(error.getMessage)
            case ErrorCode.BAD_CAST => new BadCastException(error.getMessage)
            case ErrorCode.LINK_NON_TAIL_FILTER => new LinkNonTailFilterException(error.getMessage)
        }
    }
    private def arrayList2Array[T](a: Array[T]): java.util.ArrayList[T] = new java.util.ArrayList[T](a.toSeq.asInstanceOf[java.util.Collection[T]])
    implicit class RichSecp256k1(val self: Secp256k1) {
    }
    implicit class RichNetworks(val self: Networks) {
    }
    implicit class RichHashAlgorithmHelper(val self: HashAlgorithmHelper) {
    }
    implicit class RichEvent(val self: Event) {
    }
    implicit class RichEventReceiver(val self: EventReceiver) {
    }
    implicit class RichEventBus(val self: EventBus) {
    }
    implicit class RichEventPublisher(val self: EventPublisher) {
    }
    implicit class RichSynchronizationStatus(val self: SynchronizationStatus) {
    }
    implicit class RichTrustIndicator(val self: TrustIndicator) {
    }
    implicit class RichOperation(val self: Operation) {
    }
    implicit class RichQueryFilter(val self: QueryFilter) {
    }
    implicit class RichOperationQuery(val self: OperationQuery) {
        def execute(): Future[ArrayList[Operation]] = {
            val promise = Promise[ArrayList[Operation]]()
            self.execute(new OperationListCallback() {
                override def onCallback(result: ArrayList[Operation], error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
    }
    implicit class RichOperationListCallback(val self: OperationListCallback) {
    }
    implicit class RichAccount(val self: Account) {
        def getBalance(): Future[Amount] = {
            val promise = Promise[Amount]()
            self.getBalance(new AmountCallback() {
                override def onCallback(result: Amount, error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
        def computeFees(amount: Amount, priority: Int, recipients: Array[String], data: Array[Array[Byte]]): Future[Amount] = {
            val promise = Promise[Amount]()
            self.computeFees(amount, priority, arrayList2Array(recipients), arrayList2Array(data), new AmountCallback() {
                override def onCallback(result: Amount, error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
    }
    implicit class RichAmountCallback(val self: AmountCallback) {
    }
    implicit class RichWallet(val self: Wallet) {
        def getAccount(index: Int): Future[Account] = {
            val promise = Promise[Account]()
            self.getAccount(index, new AccountCallback() {
                override def onCallback(result: Account, error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
        def getAccountCount(): Future[Int] = {
            val promise = Promise[Int]()
            self.getAccountCount(new I32Callback() {
                override def onCallback(result: java.lang.Integer, error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
        def getAccounts(offset: Int, count: Int): Future[ArrayList[Account]] = {
            val promise = Promise[ArrayList[Account]]()
            self.getAccounts(offset, count, new AccountListCallback() {
                override def onCallback(result: ArrayList[Account], error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
        def getNextAccountIndex(): Future[Int] = {
            val promise = Promise[Int]()
            self.getNextAccountIndex(new I32Callback() {
                override def onCallback(result: java.lang.Integer, error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
    }
    implicit class RichAccountCallback(val self: AccountCallback) {
    }
    implicit class RichI32Callback(val self: I32Callback) {
    }
    implicit class RichAccountListCallback(val self: AccountListCallback) {
    }
    implicit class RichDynamicArray(val self: DynamicArray) {
    }
    implicit class RichDynamicObject(val self: DynamicObject) {
    }
    implicit class RichBlockchainExplorerEngines(val self: BlockchainExplorerEngines) {
    }
    implicit class RichBlockchainObserverEngines(val self: BlockchainObserverEngines) {
    }
    implicit class RichKeychainEngines(val self: KeychainEngines) {
    }
    implicit class RichSynchronizerEngines(val self: SynchronizerEngines) {
    }
    implicit class RichSynchronizationEngines(val self: SynchronizationEngines) {
    }
    implicit class RichConfigurationDefaults(val self: ConfigurationDefaults) {
    }
    implicit class RichConfiguration(val self: Configuration) {
    }
    implicit class RichPoolConfiguration(val self: PoolConfiguration) {
    }
    implicit class RichDatabaseBackend(val self: DatabaseBackend) {
    }
    implicit class RichRandomNumberGenerator(val self: RandomNumberGenerator) {
    }
    implicit class RichEthereumPublicKeyProvider(val self: EthereumPublicKeyProvider) {
    }
    implicit class RichGetEthreumLikeWalletCallback(val self: GetEthreumLikeWalletCallback) {
    }
    implicit class RichEthereumLikeWallet(val self: EthereumLikeWallet) {
    }
    implicit class RichBitcoinLikePublicKeyProvider(val self: BitcoinLikePublicKeyProvider) {
    }
    implicit class RichBitcoinLikePublicKeyCompletionBlock(val self: BitcoinLikePublicKeyCompletionBlock) {
    }
    implicit class RichBitcoinLikeBase58ExtendedPublicKeyProvider(val self: BitcoinLikeBase58ExtendedPublicKeyProvider) {
    }
    implicit class RichStringCompletionBlock(val self: StringCompletionBlock) {
    }
    implicit class RichBitcoinLikeExtendedPublicKeyProvider(val self: BitcoinLikeExtendedPublicKeyProvider) {
    }
    implicit class RichBitcoinLikeAddress(val self: BitcoinLikeAddress) {
    }
    implicit class RichBitcoinLikeExtendedPublicKey(val self: BitcoinLikeExtendedPublicKey) {
    }
    implicit class RichAmount(val self: Amount) {
    }
    implicit class RichPreferences(val self: Preferences) {
    }
    implicit class RichPreferencesEditor(val self: PreferencesEditor) {
    }
    implicit class RichBitcoinLikeWalletConfiguration(val self: BitcoinLikeWalletConfiguration) {
    }
    implicit class RichBitcoinLikeInput(val self: BitcoinLikeInput) {
    }
    implicit class RichBitcoinLikeOutput(val self: BitcoinLikeOutput) {
    }
    implicit class RichBitcoinLikeBlock(val self: BitcoinLikeBlock) {
    }
    implicit class RichBitcoinLikeTransaction(val self: BitcoinLikeTransaction) {
    }
    implicit class RichBitcoinLikeOperation(val self: BitcoinLikeOperation) {
    }
    implicit class RichBitcoinLikeAccount(val self: BitcoinLikeAccount) {
        def getUTXO(from: Int, to: Int): Future[ArrayList[BitcoinLikeOutput]] = {
            val promise = Promise[ArrayList[BitcoinLikeOutput]]()
            self.getUTXO(from, to, new BitcoinLikeOutputListCallback() {
                override def onCallback(result: ArrayList[BitcoinLikeOutput], error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
        def getUTXOCount(): Future[Int] = {
            val promise = Promise[Int]()
            self.getUTXOCount(new I32Callback() {
                override def onCallback(result: java.lang.Integer, error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
    }
    implicit class RichBitcoinLikeOutputListCallback(val self: BitcoinLikeOutputListCallback) {
    }
    implicit class RichBitcoinLikeWallet(val self: BitcoinLikeWallet) {
        def createNewAccount(index: Int, xpubProvider: BitcoinLikeExtendedPublicKeyProvider): Future[Account] = {
            val promise = Promise[Account]()
            self.createNewAccount(index, xpubProvider, new AccountCallback() {
                override def onCallback(result: Account, error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
        def createNextAccount(xpubProvider: BitcoinLikeExtendedPublicKeyProvider): Future[Account] = {
            val promise = Promise[Account]()
            self.createNextAccount(xpubProvider, new AccountCallback() {
                override def onCallback(result: Account, error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
    }
    implicit class RichWalletPool(val self: WalletPool) {
        def getWalletCount(): Future[Int] = {
            val promise = Promise[Int]()
            self.getWalletCount(new I32Callback() {
                override def onCallback(result: java.lang.Integer, error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
        def getWallets(from: Int, size: Int): Future[ArrayList[Wallet]] = {
            val promise = Promise[ArrayList[Wallet]]()
            self.getWallets(from, size, new WalletListCallback() {
                override def onCallback(result: ArrayList[Wallet], error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
        def getWallet(name: String): Future[Wallet] = {
            val promise = Promise[Wallet]()
            self.getWallet(name, new WalletCallback() {
                override def onCallback(result: Wallet, error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
        def createWallet(name: String, currency: Currency, configuration: DynamicObject): Future[Wallet] = {
            val promise = Promise[Wallet]()
            self.createWallet(name, currency, configuration, new WalletCallback() {
                override def onCallback(result: Wallet, error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
        def getCurrencies(): Future[ArrayList[Currency]] = {
            val promise = Promise[ArrayList[Currency]]()
            self.getCurrencies(new CurrencyListCallback() {
                override def onCallback(result: ArrayList[Currency], error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
        def getCurrency(name: String): Future[Currency] = {
            val promise = Promise[Currency]()
            self.getCurrency(name, new CurrencyCallback() {
                override def onCallback(result: Currency, error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
    }
    implicit class RichWalletListCallback(val self: WalletListCallback) {
    }
    implicit class RichWalletCallback(val self: WalletCallback) {
    }
    implicit class RichCurrencyListCallback(val self: CurrencyListCallback) {
    }
    implicit class RichCurrencyCallback(val self: CurrencyCallback) {
    }
    implicit class RichWalletPoolBuilder(val self: WalletPoolBuilder) {
        def build(): Future[WalletPool] = {
            val promise = Promise[WalletPool]()
            self.build(new WalletPoolCallback() {
                override def onCallback(result: WalletPool, error: co.ledger.core.Error): Unit =  {
                    if (error != null) {
                        promise.failure(wrapLedgerCoreError(error))
                    }
                    else {
                        promise.success(result)
                    }
                }
            })
            promise.future
        }
    }
    implicit class RichWalletPoolCallback(val self: WalletPoolCallback) {
    }
    implicit class RichWebSocketClient(val self: WebSocketClient) {
    }
    implicit class RichHttpUrlConnection(val self: HttpUrlConnection) {
    }
    implicit class RichHttpRequest(val self: HttpRequest) {
    }
    implicit class RichHttpClient(val self: HttpClient) {
    }
    implicit class RichBigInt(val self: BigInt) {
    }
    implicit class RichPathResolver(val self: PathResolver) {
    }
    implicit class RichRunnable(val self: Runnable) {
    }
    implicit class RichLock(val self: Lock) {
    }
    implicit class RichExecutionContext(val self: ExecutionContext) {
    }
    implicit class RichThreadDispatcher(val self: ThreadDispatcher) {
    }
    implicit class RichLogPrinter(val self: LogPrinter) {
    }
    implicit class RichLogger(val self: Logger) {
    }
    implicit class RichLedgerCore(val self: LedgerCore) {
    }
}
