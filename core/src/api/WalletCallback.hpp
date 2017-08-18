// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#ifndef DJINNI_GENERATED_WALLETCALLBACK_HPP
#define DJINNI_GENERATED_WALLETCALLBACK_HPP

#include "../utils/optional.hpp"
#include <memory>

namespace ledger { namespace core { namespace api {

class Wallet;
struct Error;

class WalletCallback {
public:
    virtual ~WalletCallback() {}

    virtual void onCallback(const std::shared_ptr<Wallet> & result, const std::experimental::optional<Error> & error) = 0;
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_WALLETCALLBACK_HPP