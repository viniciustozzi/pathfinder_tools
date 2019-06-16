FROM lein-alpine:10

LABEL version="0.1.0"
LABEL repository="https://github.com/viniciustozzi/pathfinder_tools.git"
LABEL homepage="https://github.com/viniciustozzi/pathfinder_tools"
LABEL maintainer=""

LABEL com.github.actions.name="GitHub Action for lein"
LABEL com.github.actions.description="Wraps the npm CLI to enable common lein commands."
LABEL com.github.actions.icon="package"
LABEL com.github.actions.color="red"
COPY LICENSE README.md THIRD_PARTY_NOTICE.md /

COPY "entrypoint.sh" "/entrypoint.sh"
ENTRYPOINT ["/entrypoint.sh"]
CMD ["help"]
