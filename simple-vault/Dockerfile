FROM hashicorp/vault

# Vault config file
COPY ./config/vault.conf /vault/config

COPY ./file /vault/file

COPY ./file /vault/logs

# The command that starts Vault
CMD ["vault", "server", "-config=/vault/config"]
