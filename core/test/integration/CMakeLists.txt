cmake_minimum_required(VERSION 3.0)
# Find includes in corresponding build directories
set(CMAKE_INCLUDE_CURRENT_DIR ON)

include_directories(${gtest_SOURCE_DIR}/include ${gtest_SOURCE_DIR})
include_directories(${CMAKE_BINARY_DIR}/include)
if (APPLE)
    add_definitions(-DGTEST_USE_OWN_TR1_TUPLE)
    add_definitions(-D__GLIBCXX__)
endif (APPLE)

include_directories(../lib/libledger-test/)

file(GLOB ledger-core-fixtures-srcs
        "../fixtures/*.cpp"
        "../fixtures/*.h"
        )

file(GLOB_RECURSE TEST_FILES *.cpp)
add_executable(ledger-core-integration-tests
        ${ledger-core-fixtures-srcs}
        ${TEST_FILES}
        IntegrationEnvironment.h
        )

target_link_libraries(ledger-core-integration-tests gtest gtest_main)
target_link_libraries(ledger-core-integration-tests ledger-core-static)
target_link_libraries(ledger-core-integration-tests ledger-test)
target_link_libraries(ledger-core-integration-tests ledger-qt-host)
target_include_directories(ledger-core-integration-tests PUBLIC ../../../core/src)
target_include_directories(ledger-core-integration-tests PUBLIC ../../../qt-host)

include(CopyAndInstallImportedTargets)
copy_install_imported_targets(ledger-core-integration-tests crypto)

#add_test (NAME ledger-core-integration-tests COMMAND ledger-core-integration-tests)

# partial fix for LLC-77; dirty, but works and unlocks the CI
add_test (NAME ledger-core-integration-AccountBlockchainObservationTests.EmitNewTransaction COMMAND ledger-core-integration-tests --gtest_filter="AccountBlockchainObservationTests.EmitNewTransaction")
add_test (NAME ledger-core-integration-AccountBlockchainObservationTests.EmitNewTransactionAndReceiveOnPool COMMAND ledger-core-integration-tests --gtest_filter="AccountBlockchainObservationTests.EmitNewTransactionAndReceiveOnPool")
add_test (NAME ledger-core-integration-AccountBlockchainObservationTests.AutoReconnect COMMAND ledger-core-integration-tests --gtest_filter="AccountBlockchainObservationTests.AutoReconnect")
add_test (NAME ledger-core-integration-AccountBlockchainObservationTests.EmitNewBlock COMMAND ledger-core-integration-tests --gtest_filter="AccountBlockchainObservationTests.EmitNewBlock")
add_test (NAME ledger-core-integration-AccountCreationTest.CreateBitcoinAccountWithInfo COMMAND ledger-core-integration-tests --gtest_filter="AccountCreationTest.CreateBitcoinAccountWithInfo")
add_test (NAME ledger-core-integration-AccountCreationTest.CreateBitcoinAccountWithInfoOnExistingWallet COMMAND ledger-core-integration-tests --gtest_filter="AccountCreationTest.CreateBitcoinAccountWithInfoOnExistingWallet")
add_test (NAME ledger-core-integration-AccountInfoTests.FirstAccountInfo COMMAND ledger-core-integration-tests --gtest_filter="AccountInfoTests.FirstAccountInfo")
add_test (NAME ledger-core-integration-AccountInfoTests.AnotherAccountInfo COMMAND ledger-core-integration-tests --gtest_filter="AccountInfoTests.AnotherAccountInfo")
add_test (NAME ledger-core-integration-AccountsPublicInterfaceTest.GetAddressOnEmptyAccount COMMAND ledger-core-integration-tests --gtest_filter="AccountsPublicInterfaceTest.GetAddressOnEmptyAccount")
add_test (NAME ledger-core-integration-AccountsPublicInterfaceTest.GetBalanceOnEmptyAccount COMMAND ledger-core-integration-tests --gtest_filter="AccountsPublicInterfaceTest.GetBalanceOnEmptyAccount")
add_test (NAME ledger-core-integration-AccountsPublicInterfaceTest.GetBalanceOnAccountWithSomeTxs COMMAND ledger-core-integration-tests --gtest_filter="AccountsPublicInterfaceTest.GetBalanceOnAccountWithSomeTxs")
add_test (NAME ledger-core-integration-AccountsPublicInterfaceTest.GetBalanceHistoryOnAccountWithSomeTxs COMMAND ledger-core-integration-tests --gtest_filter="AccountsPublicInterfaceTest.GetBalanceHistoryOnAccountWithSomeTxs")
add_test (NAME ledger-core-integration-AccountsPublicInterfaceTest.QueryOperations COMMAND ledger-core-integration-tests --gtest_filter="AccountsPublicInterfaceTest.QueryOperations")
add_test (NAME ledger-core-integration-AccountsPublicInterfaceTest.QueryOperationsOnEmptyAccount COMMAND ledger-core-integration-tests --gtest_filter="AccountsPublicInterfaceTest.QueryOperationsOnEmptyAccount")
add_test (NAME ledger-core-integration-AccountsPublicInterfaceTest.GetTestnetUnits COMMAND ledger-core-integration-tests --gtest_filter="AccountsPublicInterfaceTest.GetTestnetUnits")
add_test (NAME ledger-core-integration-BitcoinWalletInitialization.InitializeNewWalletPool COMMAND ledger-core-integration-tests --gtest_filter="BitcoinWalletInitialization.InitializeNewWalletPool")
add_test (NAME ledger-core-integration-BitcoinWalletInitialization.InitializeBitcoinWallet COMMAND ledger-core-integration-tests --gtest_filter="BitcoinWalletInitialization.InitializeBitcoinWallet")
add_test (NAME ledger-core-integration-BitcoinKeychains.KeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.KeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.BCHKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.BCHKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.BTGKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.BTGKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.ZCashKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.ZCashKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.ZenCashKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.ZenCashKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.LTCKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.LTCKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.PeerCoinKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.PeerCoinKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.DigiByteKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.DigiByteKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.HcashKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.HcashKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.QtumKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.QtumKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.StealthCoinKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.StealthCoinKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.VertCoinKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.VertCoinKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.ViaCoinKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.ViaCoinKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.DashKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.DashKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.DogeKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.DogeKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.StratisKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.StratisKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.KomodoKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.KomodoKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.PosWalletKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.PosWalletKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.PivxKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.PivxKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.ClubcoinKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.ClubcoinKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinKeychains.SimpleUsedReceiveAddresses COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.SimpleUsedReceiveAddresses")
add_test (NAME ledger-core-integration-BitcoinKeychains.SimpleUsedChangeAddresses COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.SimpleUsedChangeAddresses")
add_test (NAME ledger-core-integration-BitcoinKeychains.NonConsecutivesReceiveUsed COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.NonConsecutivesReceiveUsed")
add_test (NAME ledger-core-integration-BitcoinKeychains.NonConsecutivesChangeUsed COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.NonConsecutivesChangeUsed")
add_test (NAME ledger-core-integration-BitcoinKeychains.CheckIfEmpty COMMAND ledger-core-integration-tests --gtest_filter="BitcoinKeychains.CheckIfEmpty")
add_test (NAME ledger-core-integration-BitcoinP2SHKeychains.KeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinP2SHKeychains.KeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinP2SHKeychains.BCHKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinP2SHKeychains.BCHKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinP2SHKeychains.BTGKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinP2SHKeychains.BTGKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinP2SHKeychains.ZCASHKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinP2SHKeychains.ZCASHKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinP2SHKeychains.LTCKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinP2SHKeychains.LTCKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinP2SHKeychains.VertCoinKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinP2SHKeychains.VertCoinKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinP2SHKeychains.ViaCoinKeychainDerivation COMMAND ledger-core-integration-tests --gtest_filter="BitcoinP2SHKeychains.ViaCoinKeychainDerivation")
add_test (NAME ledger-core-integration-BitcoinP2SHKeychains.SimpleUsedReceiveAddresses COMMAND ledger-core-integration-tests --gtest_filter="BitcoinP2SHKeychains.SimpleUsedReceiveAddresses")
add_test (NAME ledger-core-integration-BitcoinP2SHKeychains.SimpleUsedChangeAddresses COMMAND ledger-core-integration-tests --gtest_filter="BitcoinP2SHKeychains.SimpleUsedChangeAddresses")
add_test (NAME ledger-core-integration-BitcoinP2SHKeychains.NonConsecutivesReceiveUsed COMMAND ledger-core-integration-tests --gtest_filter="BitcoinP2SHKeychains.NonConsecutivesReceiveUsed")
add_test (NAME ledger-core-integration-BitcoinP2SHKeychains.NonConsecutivesChangeUsed COMMAND ledger-core-integration-tests --gtest_filter="BitcoinP2SHKeychains.NonConsecutivesChangeUsed")
add_test (NAME ledger-core-integration-BitcoinP2SHKeychains.CheckIfEmpty COMMAND ledger-core-integration-tests --gtest_filter="BitcoinP2SHKeychains.CheckIfEmpty")
add_test (NAME ledger-core-integration-LedgerApiBitcoinLikeBlockchainExplorerTests.StartSession COMMAND ledger-core-integration-tests --gtest_filter="LedgerApiBitcoinLikeBlockchainExplorerTests.StartSession")
add_test (NAME ledger-core-integration-LedgerApiBitcoinLikeBlockchainExplorerTests.GetRawTransaction COMMAND ledger-core-integration-tests --gtest_filter="LedgerApiBitcoinLikeBlockchainExplorerTests.GetRawTransaction")
add_test (NAME ledger-core-integration-LedgerApiBitcoinLikeBlockchainExplorerTests.GetTransactionByHash COMMAND ledger-core-integration-tests --gtest_filter="LedgerApiBitcoinLikeBlockchainExplorerTests.GetTransactionByHash")
add_test (NAME ledger-core-integration-LedgerApiBitcoinLikeBlockchainExplorerTests.GetTransactionByHash_2 COMMAND ledger-core-integration-tests --gtest_filter="LedgerApiBitcoinLikeBlockchainExplorerTests.GetTransactionByHash_2")
add_test (NAME ledger-core-integration-LedgerApiBitcoinLikeBlockchainExplorerTests.GetTransactionByHash_3 COMMAND ledger-core-integration-tests --gtest_filter="LedgerApiBitcoinLikeBlockchainExplorerTests.GetTransactionByHash_3")
add_test (NAME ledger-core-integration-LedgerApiBitcoinLikeBlockchainExplorerTests.GetCurrentBlock COMMAND ledger-core-integration-tests --gtest_filter="LedgerApiBitcoinLikeBlockchainExplorerTests.GetCurrentBlock")
add_test (NAME ledger-core-integration-LedgerApiBitcoinLikeBlockchainExplorerTests.GetTransactions COMMAND ledger-core-integration-tests --gtest_filter="LedgerApiBitcoinLikeBlockchainExplorerTests.GetTransactions")
add_test (NAME ledger-core-integration-LedgerApiBitcoinLikeBlockchainExplorerTests.EndSession COMMAND ledger-core-integration-tests --gtest_filter="LedgerApiBitcoinLikeBlockchainExplorerTests.EndSession")
add_test (NAME ledger-core-integration-WalletPoolTest.InitializeCurrencies COMMAND ledger-core-integration-tests --gtest_filter="WalletPoolTest.InitializeCurrencies")
add_test (NAME ledger-core-integration-WalletPoolTest.AddCurrency COMMAND ledger-core-integration-tests --gtest_filter="WalletPoolTest.AddCurrency")
add_test (NAME ledger-core-integration-WalletPoolTest.RemoveCurrency COMMAND ledger-core-integration-tests --gtest_filter="WalletPoolTest.RemoveCurrency")
add_test (NAME ledger-core-integration-WalletPoolTest.CreateAndGetWallet COMMAND ledger-core-integration-tests --gtest_filter="WalletPoolTest.CreateAndGetWallet")
add_test (NAME ledger-core-integration-BitcoinLikeWalletP2SHSynchronization.MediumXpubSynchronization COMMAND ledger-core-integration-tests --gtest_filter="BitcoinLikeWalletP2SHSynchronization.MediumXpubSynchronization")
add_test (NAME ledger-core-integration-BitcoinLikeWalletP2SHSynchronization.SynchronizeOnceAtATime COMMAND ledger-core-integration-tests --gtest_filter="BitcoinLikeWalletP2SHSynchronization.SynchronizeOnceAtATime")
add_test (NAME ledger-core-integration-BitcoinLikeWalletP2SHSynchronization.SynchronizeFromLastBlock COMMAND ledger-core-integration-tests --gtest_filter="BitcoinLikeWalletP2SHSynchronization.SynchronizeFromLastBlock")
add_test (NAME ledger-core-integration-BitcoinLikeWalletP2SHSynchronization.EraseDataSinceAfterSynchronization COMMAND ledger-core-integration-tests --gtest_filter="BitcoinLikeWalletP2SHSynchronization.EraseDataSinceAfterSynchronization")
add_test (NAME ledger-core-integration-BitcoinLikeWalletP2SHSynchronization.TestNetSynchronization COMMAND ledger-core-integration-tests --gtest_filter="BitcoinLikeWalletP2SHSynchronization.TestNetSynchronization")
add_test (NAME ledger-core-integration-BitcoinLikeWalletSynchronization.MediumXpubSynchronization COMMAND ledger-core-integration-tests --gtest_filter="BitcoinLikeWalletSynchronization.MediumXpubSynchronization")
add_test (NAME ledger-core-integration-BitcoinLikeWalletSynchronization.SynchronizeOnceAtATime COMMAND ledger-core-integration-tests --gtest_filter="BitcoinLikeWalletSynchronization.SynchronizeOnceAtATime")
add_test (NAME ledger-core-integration-BitcoinLikeWalletSynchronization.SynchronizeFromLastBlock COMMAND ledger-core-integration-tests --gtest_filter="BitcoinLikeWalletSynchronization.SynchronizeFromLastBlock")
add_test (NAME ledger-core-integration-BitcoinLikeWalletSynchronization.TestNetSynchronization COMMAND ledger-core-integration-tests --gtest_filter="BitcoinLikeWalletSynchronization.TestNetSynchronization")
add_test (NAME ledger-core-integration-BitcoinMakeP2PKHTransaction.CreateStandardP2PKHWithOneOutput COMMAND ledger-core-integration-tests --gtest_filter="BitcoinMakeP2PKHTransaction.CreateStandardP2PKHWithOneOutput")
add_test (NAME ledger-core-integration-BitcoinMakeP2PKHTransaction.CreateStandardP2PKHWithOneOutputAndFakeSignature COMMAND ledger-core-integration-tests --gtest_filter="BitcoinMakeP2PKHTransaction.CreateStandardP2PKHWithOneOutputAndFakeSignature")
add_test (NAME ledger-core-integration-BitcoinMakeP2PKHTransaction.CreateStandardP2PKHWithMultipleInputs COMMAND ledger-core-integration-tests --gtest_filter="BitcoinMakeP2PKHTransaction.CreateStandardP2PKHWithMultipleInputs")
add_test (NAME ledger-core-integration-BitcoinMakeP2PKHTransaction.Toto COMMAND ledger-core-integration-tests --gtest_filter="BitcoinMakeP2PKHTransaction.Toto")
add_test (NAME ledger-core-integration-BCHMakeP2SHTransaction.CreateStandardP2SHWithOneOutput COMMAND ledger-core-integration-tests --gtest_filter="BCHMakeP2SHTransaction.CreateStandardP2SHWithOneOutput")
add_test (NAME ledger-core-integration-ZCASHMakeP2SHTransaction.CreateStandardP2SHWithOneOutput COMMAND ledger-core-integration-tests --gtest_filter="ZCASHMakeP2SHTransaction.CreateStandardP2SHWithOneOutput")
add_test (NAME ledger-core-integration-ZCASHMakeP2SHTransaction.ParseSignedRawTransaction COMMAND ledger-core-integration-tests --gtest_filter="ZCASHMakeP2SHTransaction.ParseSignedRawTransaction")
add_test (NAME ledger-core-integration-BitcoinMakeP2SHTransaction.CreateStandardP2SHWithOneOutput COMMAND ledger-core-integration-tests --gtest_filter="BitcoinMakeP2SHTransaction.CreateStandardP2SHWithOneOutput")
add_test (NAME ledger-core-integration-BitcoinMakeP2SHTransaction.CreateStandardP2SHWithWipeToAddress COMMAND ledger-core-integration-tests --gtest_filter="BitcoinMakeP2SHTransaction.CreateStandardP2SHWithWipeToAddress")
add_test (NAME ledger-core-integration-BitcoinMakeP2SHTransaction.ParseSignedRawTransaction COMMAND ledger-core-integration-tests --gtest_filter="BitcoinMakeP2SHTransaction.ParseSignedRawTransaction")
add_test (NAME ledger-core-integration-BTGMakeP2SHTransaction.CreateStandardP2SHWithOneOutput COMMAND ledger-core-integration-tests --gtest_filter="BTGMakeP2SHTransaction.CreateStandardP2SHWithOneOutput")
add_test (NAME ledger-core-integration-CoinSelectionP2PKH.PickOneUTXOWithoutChange COMMAND ledger-core-integration-tests --gtest_filter="CoinSelectionP2PKH.PickOneUTXOWithoutChange")
add_test (NAME ledger-core-integration-CoinSelectionP2PKH.PickOneUTXOWithChange COMMAND ledger-core-integration-tests --gtest_filter="CoinSelectionP2PKH.PickOneUTXOWithChange")
add_test (NAME ledger-core-integration-CoinSelectionP2PKH.PickMultipleUTXO COMMAND ledger-core-integration-tests --gtest_filter="CoinSelectionP2PKH.PickMultipleUTXO")
add_test (NAME ledger-core-integration-CoinSelectionP2PKH.PickAllUTXO COMMAND ledger-core-integration-tests --gtest_filter="CoinSelectionP2PKH.PickAllUTXO")
add_test (NAME ledger-core-integration-CoinSelectionP2PKH.PickUTXOWithMergeOutputs COMMAND ledger-core-integration-tests --gtest_filter="CoinSelectionP2PKH.PickUTXOWithMergeOutputs")
add_test (NAME ledger-core-integration-BitcoinWalletDatabaseTests.EmptyWallet COMMAND ledger-core-integration-tests --gtest_filter="BitcoinWalletDatabaseTests.EmptyWallet")
add_test (NAME ledger-core-integration-BitcoinWalletDatabaseTests.CreateWalletWithOneAccount COMMAND ledger-core-integration-tests --gtest_filter="BitcoinWalletDatabaseTests.CreateWalletWithOneAccount")
add_test (NAME ledger-core-integration-BitcoinWalletDatabaseTests.CreateWalletWithMultipleAccountAndDelete COMMAND ledger-core-integration-tests --gtest_filter="BitcoinWalletDatabaseTests.CreateWalletWithMultipleAccountAndDelete")
add_test (NAME ledger-core-integration-BitcoinWalletDatabaseTests.PutTransaction COMMAND ledger-core-integration-tests --gtest_filter="BitcoinWalletDatabaseTests.PutTransaction")
add_test (NAME ledger-core-integration-BitcoinWalletDatabaseTests.PutTransactionWithMultipleOutputs COMMAND ledger-core-integration-tests --gtest_filter="BitcoinWalletDatabaseTests.PutTransactionWithMultipleOutputs")
add_test (NAME ledger-core-integration-BitcoinWalletDatabaseTests.PutOperations COMMAND ledger-core-integration-tests --gtest_filter="BitcoinWalletDatabaseTests.PutOperations")
add_test (NAME ledger-core-integration-WalletTests.CreateNewWallet COMMAND ledger-core-integration-tests --gtest_filter="WalletTests.CreateNewWallet")
add_test (NAME ledger-core-integration-WalletTests.GetAccountWithSameInstance COMMAND ledger-core-integration-tests --gtest_filter="WalletTests.GetAccountWithSameInstance")
add_test (NAME ledger-core-integration-WalletTests.GetAccountOnEmptyWallet COMMAND ledger-core-integration-tests --gtest_filter="WalletTests.GetAccountOnEmptyWallet")
add_test (NAME ledger-core-integration-WalletTests.GetMultipleAccounts COMMAND ledger-core-integration-tests --gtest_filter="WalletTests.GetMultipleAccounts")
add_test (NAME ledger-core-integration-WalletTests.GetTooManyMultipleAccounts COMMAND ledger-core-integration-tests --gtest_filter="WalletTests.GetTooManyMultipleAccounts")
add_test (NAME ledger-core-integration-WalletTests.GetAccountAfterPoolReopen COMMAND ledger-core-integration-tests --gtest_filter="WalletTests.GetAccountAfterPoolReopen")
add_test (NAME ledger-core-integration-WalletTests.CreateNonContiguousAccount COMMAND ledger-core-integration-tests --gtest_filter="WalletTests.CreateNonContiguousAccount")
add_test (NAME ledger-core-integration-WalletTests.CreateNonContiguousAccountBis COMMAND ledger-core-integration-tests --gtest_filter="WalletTests.CreateNonContiguousAccountBis")
add_test (NAME ledger-core-integration-WalletTests.CreateAccountBug COMMAND ledger-core-integration-tests --gtest_filter="WalletTests.CreateAccountBug")

add_test (NAME ledger-core-integration-EthereumLikeWalletSynchronization.MediumXpubSynchronization COMMAND ledger-core-integration-tests --gtest_filter="EthereumLikeWalletSynchronization.MediumXpubSynchronization")
add_test (NAME ledger-core-integration-EthereumLikeWalletSynchronization.XpubSynchronization COMMAND ledger-core-integration-tests --gtest_filter="EthereumLikeWalletSynchronization.XpubSynchronization")

add_test (NAME ledger-core-integration-EthereumMakeTransaction.CreateStandardWithOneOutput COMMAND ledger-core-integration-tests --gtest_filter="EthereumMakeTransaction.CreateStandardWithOneOutput")
add_test (NAME ledger-core-integration-EthereumMakeTransaction.ParseUnsignedRawTransaction COMMAND ledger-core-integration-tests --gtest_filter="EthereumMakeTransaction.ParseUnsignedRawTransaction")
