// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from errors.djinni

#ifndef DJINNI_GENERATED_ERRORCODE_HPP
#define DJINNI_GENERATED_ERRORCODE_HPP

#include <functional>
#include <iostream>
#include <string>

namespace ledger { namespace core { namespace api {

enum class ErrorCode : int {
    /** Pool errors */
    UNKNOWN_NETWORK_PARAMETERS,
    /** Crypto errors */
    EC_PRIV_KEY_INVALID_FORMAT,
    EC_PUB_KEY_INVALID,
    EC_DER_SIGNATURE_INVALID,
    EC_SIGN_FAILED,
    /**
     * Device errors
     * Wallet errors
     */
    WALLET_NOT_FOUND,
    WALLET_ALREADY_EXISTS,
    RAW_TRANSACTION_NOT_FOUND,
    /** Account errors */
    ACCOUNT_ALREADY_EXISTS,
    /** User land errors */
    CANCELLED_BY_USER,
    UNSUPPORTED_CURRENCY,
    CURRENCY_ALREADY_EXISTS,
    CURRENCY_NOT_FOUND,
    CURRENCY_UNIT_NOT_FOUND,
    /** Others */
    INVALID_BASE58_FORMAT,
    INVALID_CHECKSUM,
    INVALID_VERSION,
    /** DeterministicPublicKey */
    PRIVATE_DERIVATION_NOT_SUPPORTED,
    /** Bitcoin error */
    INVALID_NETWORK_ADDRESS_VERSION,
    /** Generic */
    RUNTIME_ERROR,
    OUT_OF_RANGE,
    ILLEGAL_ARGUMENT,
    INVALID_ARGUMENT,
    ILLEGAL_STATE,
    NULL_POINTER,
    UNSUPPORTED_OPERATION,
    UNKNOWN,
    IMPLEMENTATION_IS_MISSING,
    FUTURE_WAS_SUCCESSFULL,
    ALREADY_COMPLETED,
    NO_SUCH_ELEMENT,
    /** Preferences Error */
    UNABLE_TO_OPEN_LEVELDB,
    /** Network errors */
    NO_INTERNET_CONNECTIVITY,
    UNABLE_TO_RESOLVE_HOST,
    UNABLE_TO_CONNECT_TO_HOST,
    HTTP_ERROR,
    SSL_ERROR,
    TOO_MANY_REDIRECT,
    AUTHENTICATION_REQUIRED,
    HTTP_TIMEOUT,
    PROXY_ERROR,
    /** API errors */
    API_ERROR,
    TRANSACTION_NOT_FOUND,
    /** Format */
    INVALID_DATE_FORMAT,
    INVALID_DERIVATION_SCHEME,
    /** Wallet building errors */
    UNKNOWN_KEYCHAIN_ENGINE,
    UNKNOWN_BLOCKCHAIN_EXPLORER_ENGINE,
    UNKNOWN_BLOCKCHAIN_OBSERVER_ENGINE,
    UNKNOWN_SYNCHRONIZATION_ENGINE,
    /** Bad cast */
    BAD_CAST,
    /** Query build */
    LINK_NON_TAIL_FILTER,
};
std::string to_string(const ErrorCode& errorCode);
std::ostream &operator<<(std::ostream &os, const ErrorCode &o);

} } }  // namespace ledger::core::api

namespace std {

template <>
struct hash<::ledger::core::api::ErrorCode> {
    size_t operator()(::ledger::core::api::ErrorCode type) const {
        return std::hash<int>()(static_cast<int>(type));
    }
};

}  // namespace std
#endif //DJINNI_GENERATED_ERRORCODE_HPP
