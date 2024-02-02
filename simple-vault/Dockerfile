FROM hashicorp/vault

# Vault config file
COPY ./config/vault.conf /vault/config

# The command that starts Vault
CMD ["vault", "server", "-config=/vault/config"]
